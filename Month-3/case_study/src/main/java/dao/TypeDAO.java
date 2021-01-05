package dao;

import model.Producer;
import model.Type;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeDAO extends ConectionHelper implements BaseDAO<Type> {

    private static final String INSERT_TYPE_SQL = "INSERT INTO type" + "  (name) VALUES " +
            " (?);";

    private static final String SELECT_TYPE_BY_ID = "select id_type,name from type where id_type =?;";
    private static final String SELECT_ALL_TYPE = "SELECT * FROM type;";
    private static final String DELETE_TYPE_SQL = "delete from type where id_type = ?;";
    private static final String UPDATE_TYPE_SQL = "update type set name = ? where id_type = ?;";
    private static final String SORT_ALL_USERS = "SELECT * from users order by name ASC;";
    private static final String SEARCH_WITH_COUNTRY = "SELECT * from users where country LIKE concat('%',?,'%');";

    @Override
    public List<Type> getAll() throws Exception {
        List<Type> types = new ArrayList<>();

        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TYPE);) {
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_type");
                String name = rs.getString("name");
                types.add(new Type(id, name));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return types;
    }


    @Override
    public void save(Type type) throws Exception {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TYPE_SQL)) {
            preparedStatement.setString(1, type.getName());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    @Override
    public boolean update(Type type) throws Exception {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_TYPE_SQL);) {

            statement.setString(1, type.getName());
            statement.setInt(2, type.getId());


            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }


    @Override
    public boolean delete(int id) throws Exception {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_TYPE_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public Type findById(int id) throws Exception {
        Type type = null;

        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TYPE_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                type = new Type(id, name);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return type;
    }
}
