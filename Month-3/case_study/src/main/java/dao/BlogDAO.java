package dao;

import model.Blog;
import model.Type;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BlogDAO extends ConectionHelper implements BaseDAO<Blog> {
    private static final String INSERT_BLOG_SQL = "INSERT INTO blog" + "  (title,content) VALUES " +
            " (?,?);";
    private static final String SELECT_BLOG_BY_ID = "select id_blog,title,content from blog where id_blog =?;";
    private static final String SELECT_ALL_BLOG = "SELECT * FROM blog;";
    private static final String DELETE_BLOG_SQL = "delete from blog where id_blog = ?;";
    private static final String UPDATE_BLOG_SQL = "update blog set title = ?,content=? where id_blog = ?;";
    private static final String SEARCH_WITH_TITLE = "SELECT * from blog where title LIKE concat('%',?,'%');";

    @Override
    public List<Blog> getAll() throws Exception {
        List<Blog> blogs = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BLOG);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_blog");
                String title = rs.getString("title");
                String content = rs.getString("content");
                blogs.add(new Blog(id, title, content));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return blogs;
    }

    @Override
    public void save(Blog blog) throws Exception {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BLOG_SQL)) {
            preparedStatement.setString(1, blog.getTitle());
            preparedStatement.setString(2, blog.getContent());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public boolean update(Blog blog) throws Exception {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_BLOG_SQL);) {
            statement.setString(1, blog.getTitle());
            statement.setString(2, blog.getContent());
            statement.setInt(3, blog.getId_blog());
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    @Override
    public boolean delete(int id) throws Exception {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_BLOG_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public Blog findById(int id) throws Exception {
        Blog blog = null;

        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BLOG_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String title = rs.getString("title");
                String content = rs.getString("content");
                blog = new Blog(id, title, content);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return blog;
    }
}

