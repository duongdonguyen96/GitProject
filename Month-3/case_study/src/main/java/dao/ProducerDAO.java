package dao;

import model.Producer;
import model.Type;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerDAO extends ConectionHelper implements BaseDAO<Producer> {
    private static final String INSERT_PRODUCERS_SQL = "INSERT INTO producer" + "  (name, phone, address) VALUES " +
            " (?, ?, ?);";

    private static final String SELECT_PRODUCER_BY_ID = "select id_producer,name,phone,address from producer where id_producer =?";
    private static final String SELECT_ALL_PRODUCERS = "select * from producer";
    private static final String DELETE_USERS_SQL = "delete from producer where id_producer = ?;";
    private static final String UPDATE_PRODUCER_SQL = "update producer set name = ?,phone= ?, address =? where id_producer = ?;";
    private static final String SORT_ALL_USERS = "SELECT * from users order by name ASC;";
    private static final String SEARCH_WITH_COUNTRY = "SELECT * from users where country LIKE concat('%',?,'%');";

    @Override
    public List<Producer> getAll() throws Exception {
        List<Producer> producers = new ArrayList<>();

        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCERS);) {
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_producer");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                producers.add(new Producer(id, name, phone, address));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return producers;
    }


    @Override
    public void save(Producer producer) throws Exception {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCERS_SQL)) {
            preparedStatement.setString(1, producer.getName());
            preparedStatement.setString(2, producer.getPhone());
            preparedStatement.setString(3, producer.getAddress());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    @Override
    public boolean update(Producer producer) throws Exception {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCER_SQL);) {
            statement.setString(1, producer.getName());
            statement.setString(2, producer.getPhone());
            statement.setString(3, producer.getAddress());
            statement.setInt(4, producer.getId());


            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }


    @Override
    public boolean delete(int id) throws Exception {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public Producer findById(int id) throws Exception {
        Producer producer = null;

        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                producer = new Producer(id, name, phone, address);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return producer;
    }


}

