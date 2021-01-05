package dao;

import model.Producer;
import model.Product;
import model.Type;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends ConectionHelper implements BaseDAO<Product> {
    private static final String INSERT_PRODUCT_SQL = "INSERT INTO product" + "  (price,description,name,amount,image,amountSold,evaluate,discount,type_id_type ,producer_id_producer) VALUES " +
            " (?, ?, ?,?, ?, ?,?,?,?,?);";

    private static final String SELECT_PRODUCT_BY_ID = "select product.*,type.name as nameType,producer.name as producerName from product inner join type on product.type_id_type = type.id_type inner join producer on producer.id_producer = product.producer_id_producer where product.id_product =?;";
    private static final String SELECT_ALL_PRODUCT = "select product.*,type.name as nameType,producer.name as producerName from product inner join type on product.type_id_type = type.id_type inner join producer on producer.id_producer = product.producer_id_producer;";
    private static final String DELETE_PRODUCT_SQL = "delete from product where id_product = ?;";
    private static final String UPDATE_PRODUCT_SQL = "update product set price = ?,description=?,name=?,amount=?,image=?,amountSold=?,evaluate=?,discount=?,type_id_type=?, producer_id_producer=? where id_product = ?;";
    private static final String TOP_10_NEW_PRODUCTS = "SELECT * FROM product ORDER BY id_product DESC LIMIT 6;";
    private static final String TOP_3_HOT_PRODUCTS = "SELECT * FROM product ORDER BY amountSold DESC LIMIT 3;";
    private static final String LIST_TYPE_MAIN_DISHES = " SELECT * FROM product INNER JOIN type on type.id_type = product.type_id_type where id_type='1' ;";
    private static final String LIST_TYPE_DRINKS = " SELECT * FROM product INNER JOIN type on type.id_type = product.type_id_type where id_type='2' ;";
    private static final String LIST_TYPE_DESSERTS = " SELECT * FROM product INNER JOIN type on type.id_type = product.type_id_type where id_type='3' ;";
    private static final String SORT_ALL_USERS = "SELECT * from users order by name ASC;";
    private static final String SEARCH_WITH_NAME = "select product.*,type.name as nameType,producer.name as producerName from product  inner join type on product.type_id_type = type.id_type inner join producer on producer.id_producer = product.producer_id_producer where product.name LIKE concat('%',?,'%');";
    private static final String PAGING_LIST_PRODUCT="select product.*,type.name as nameType,producer.name as producerName from product inner join type on product.type_id_type = type.id_type inner join producer on producer.id_producer = product.producer_id_producer ORDER BY id_product limit ?,5;";
    @Override
    public List<Product> getAll() throws Exception {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_product");
                String description = rs.getString("description");
                String name = rs.getString("name");
                int price = Integer.parseInt(rs.getString("price"));
                int amount = rs.getInt("amount");
                String image = rs.getString("image");
                int productcol = rs.getInt("amountSold");
                int evaluate = rs.getInt("evaluate");
                int discount = rs.getInt("discount");
                int type_idtype = rs.getInt("type_id_type");
                String nameType = rs.getString("nameType");
                Type type = new Type(type_idtype, nameType);
                Producer producer = new Producer(rs.getString("producerName"), rs.getInt("producer_id_producer"));
                Product product = new Product(id, price, description, name, amount, image, productcol, evaluate, discount, type, producer);
                product.setType(type);
                products.add(product);

            }

        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }


    @Override
    public void save(Product product) throws Exception {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL)) {
            preparedStatement.setInt(1, product.getPrice());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setString(3, product.getName());
            preparedStatement.setInt(4, product.getAmount());
            preparedStatement.setString(5, product.getImage());
            preparedStatement.setInt(6, product.getAmountSold());
            preparedStatement.setInt(7, product.getEvaluate());
            preparedStatement.setInt(8, product.getDiscount());
            preparedStatement.setInt(9, product.getIdType());
            preparedStatement.setInt(10, product.getIdProducer());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    @Override
    public boolean update(Product product) throws Exception {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCT_SQL);) {
            statement.setInt(1, product.getPrice());
            statement.setString(2, product.getDescription());
            statement.setString(3, product.getName());
            statement.setInt(4, product.getAmount());
            statement.setString(5, product.getImage());
            statement.setInt(6, product.getAmountSold());
            statement.setInt(7, product.getEvaluate());
            statement.setInt(8, product.getDiscount());
            statement.setInt(9, product.getIdType());
            statement.setInt(10, product.getIdProducer());
            statement.setInt(11, product.getId());
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }


    @Override
    public boolean delete(int id) throws Exception {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public Product findById(int id) throws Exception {
        Product product = null;

        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int price = rs.getInt("price");
                String description = rs.getString("description");
                String name = rs.getString("name");
                int amount = rs.getInt("amount");
                String image = rs.getString("image");
                int productcol = rs.getInt("amountSold");
                int evaluate = rs.getInt("evaluate");
                int discount = rs.getInt("discount");
                int type_idtype = rs.getInt("type_id_type");
                Type type = new Type(type_idtype, rs.getString("nameType"));
                Producer producer = new Producer(rs.getString("producerName"), rs.getInt("producer_id_producer"));

                product = new Product(id, price, description, name, amount, image, productcol, evaluate, discount, type, producer);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return product;
    }


    public List<Product> top10NewProduct() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(TOP_10_NEW_PRODUCTS)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_product");
                int price = Integer.parseInt(rs.getString("price"));
                String description = rs.getString("description");
                String name = rs.getString("name");
                int amount = rs.getInt("amount");
                String image = rs.getString("image");
                int productcol = rs.getInt("amountSold");
                int evaluate = rs.getInt("evaluate");
                int discount = rs.getInt("discount");
                int type_idtype = rs.getInt("type_id_type");
                int producer_id_producer = rs.getInt("producer_id_producer");
//                String nameType = rs.getString("nameType");
//                Type type = new Type(type_idtype, nameType);
//                Producer producer = new Producer(rs.getString("producerName"), rs.getInt("producer_id_producer"));
                Product product = new Product(id, price, description, name, amount, image, productcol, evaluate, discount, type_idtype, producer_id_producer);
//                product.setType(type);
                products.add(product);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }

    public List<Product> top3HotProduct() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(TOP_3_HOT_PRODUCTS)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_product");
                int price = Integer.parseInt(rs.getString("price"));
                String description = rs.getString("description");
                String name = rs.getString("name");
                int amount = rs.getInt("amount");
                String image = rs.getString("image");
                int productcol = rs.getInt("amountSold");
                int evaluate = rs.getInt("evaluate");
                int discount = rs.getInt("discount");
                int type_idtype = rs.getInt("type_id_type");
                int producer_id_producer = rs.getInt("producer_id_producer");
//                Type type = new Type(type_idtype, nameType);
//                Producer producer = new Producer(rs.getString("producerName"), rs.getInt("producer_id_producer"));
                Product product = new Product(id, price, description, name, amount, image, productcol, evaluate, discount, type_idtype, producer_id_producer);
//                product.setType(type);
                products.add(product);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }

    public List<Product> listMainDishes() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(LIST_TYPE_MAIN_DISHES)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_product");
                int price = Integer.parseInt(rs.getString("price"));
                String description = rs.getString("description");
                String name = rs.getString("name");
                int amount = rs.getInt("amount");
                String image = rs.getString("image");
                int productcol = rs.getInt("amountSold");
                int evaluate = rs.getInt("evaluate");
                int discount = rs.getInt("discount");
                int type_idtype = rs.getInt("type_id_type");
                int producer_id_producer = rs.getInt("producer_id_producer");
//                Type type = new Type(type_idtype, nameType);
//                Producer producer = new Producer(rs.getString("producerName"), rs.getInt("producer_id_producer"));
                Product product = new Product(id, price, description, name, amount, image, productcol, evaluate, discount, type_idtype, producer_id_producer);
//                product.setType(type);
                products.add(product);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }

    public List<Product> listDrinks() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(LIST_TYPE_DRINKS)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_product");
                int price = Integer.parseInt(rs.getString("price"));
                String description = rs.getString("description");
                String name = rs.getString("name");
                int amount = rs.getInt("amount");
                String image = rs.getString("image");
                int productcol = rs.getInt("amountSold");
                int evaluate = rs.getInt("evaluate");
                int discount = rs.getInt("discount");
                int type_idtype = rs.getInt("type_id_type");
                int producer_id_producer = rs.getInt("producer_id_producer");
//                Type type = new Type(type_idtype, nameType);
//                Producer producer = new Producer(rs.getString("producerName"), rs.getInt("producer_id_producer"));
                Product product = new Product(id, price, description, name, amount, image, productcol, evaluate, discount, type_idtype, producer_id_producer);
//                product.setType(type);
                products.add(product);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }

    public List<Product> listDesserts() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(LIST_TYPE_DESSERTS)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_product");
                int price = Integer.parseInt(rs.getString("price"));
                String description = rs.getString("description");
                String name = rs.getString("name");
                int amount = rs.getInt("amount");
                String image = rs.getString("image");
                int productcol = rs.getInt("amountSold");
                int evaluate = rs.getInt("evaluate");
                int discount = rs.getInt("discount");
                int type_idtype = rs.getInt("type_id_type");
                int producer_id_producer = rs.getInt("producer_id_producer");
//                Type type = new Type(type_idtype, nameType);
//                Producer producer = new Producer(rs.getString("producerName"), rs.getInt("producer_id_producer"));
                Product product = new Product(id, price, description, name, amount, image, productcol, evaluate, discount, type_idtype, producer_id_producer);
//                product.setType(type);
                products.add(product);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }


    public List<Product> searchWithName(String nameOfProduct) {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_WITH_NAME)) {
            preparedStatement.setString(1, nameOfProduct);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_product");
                String description = rs.getString("description");
                String name = rs.getString("name");
                int price = Integer.parseInt(rs.getString("price"));
                int amount = rs.getInt("amount");
                String image = rs.getString("image");
                int productcol = rs.getInt("amountSold");
                int evaluate = rs.getInt("evaluate");
                int discount = rs.getInt("discount");
                int type_idtype = rs.getInt("type_id_type");
                String nameType = rs.getString("nameType");

                Type type = new Type(type_idtype, nameType);
                Producer producer = new Producer(rs.getString("producerName"), rs.getInt("producer_id_producer"));
                Product product = new Product(id, price, description, name, amount, image, productcol, evaluate, discount, type, producer);
                product.setType(type);
                products.add(product);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }

public int getNumberPage() {
        String query = "select count(*) from product;";
    try (Connection connection = getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
           int total = rs.getInt(1);
           int countPage = 0;
           countPage = total/5;
           if (total%5!=0) {
               countPage++;
           }
           return countPage;
        }
    } catch (SQLException e) {
        printSQLException(e);
    }
    return 0;
        }


    public List<Product> getPaging(int index) {
        List<Product> products = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(PAGING_LIST_PRODUCT)) {
            preparedStatement.setInt(1, index*5-5);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_product");
                String description = rs.getString("description");
                String name = rs.getString("name");
                int price = Integer.parseInt(rs.getString("price"));
                int amount = rs.getInt("amount");
                String image = rs.getString("image");
                int productcol = rs.getInt("amountSold");
                int evaluate = rs.getInt("evaluate");
                int discount = rs.getInt("discount");
                int type_idtype = rs.getInt("type_id_type");
                String nameType = rs.getString("nameType");
                Type type = new Type(type_idtype, nameType);
                Producer producer = new Producer(rs.getString("producerName"), rs.getInt("producer_id_producer"));
                Product product = new Product(id, price, description, name, amount, image, productcol, evaluate, discount, type, producer);
                product.setType(type);
                products.add(product);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }
}




