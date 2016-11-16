package com.apress.prospring4.ch6;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 15.11.2016.
 */
public class PlainContactDao implements ContactDao {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/prospring", "root", "root");
    }

    private void closeConnection(Connection connection) {
        if (connection == null) {
            return;
        }

        try {
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Contact> findAll() {
        List<Contact> result = new ArrayList<Contact>();
        Connection connection = null;

        try {
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from contact");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Contact contact = new Contact();
                contact.setId(resultSet.getLong("id"));
                contact.setFirstName(resultSet.getString("first_name"));
                contact.setLastName(resultSet.getString("last_name"));
                contact.setBirthDate(resultSet.getDate("birth_date"));

                result.add(contact);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection(connection);
        }
        return result;
    }

    @Override
    public List<Contact> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public String findLastNameById(Long id) {
        return null;
    }

    @Override
    public String findFirstNameById(Long id) {
        return null;
    }

    @Override
    public void insert(Contact contact) {
        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO contact(first_name, last_name, birth_date) VALUES(?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, contact.getFirstName());
            statement.setString(2, contact.getLastName());
            statement.setDate(3, contact.getBirthDate());
            statement.execute();
            ResultSet generatedKeys = statement.getGeneratedKeys();

            if (generatedKeys.next()) {
                contact.setId(generatedKeys.getLong(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection(connection);
        }
    }

    @Override
    public void update(Contact contact) {

    }

    @Override
    public void delete(Long contactId) {
        Connection connection = null;
        try {
            connection = getConnection();

            PreparedStatement statement = connection.prepareStatement("DELETE FROM contact WHERE id=?");
            statement.setLong(1, contactId);
            statement.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection(connection);
        }
    }
}
