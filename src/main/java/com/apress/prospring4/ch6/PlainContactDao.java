package com.apress.prospring4.ch6;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 15.11.2016.
 */
public class PlainContactDao implements ContactDao {
    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("");
    }
    private void closeConnection(Connection connection){
        if(connection == null){
            return;
        }

        try{
            connection.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public List<Contact> findAll() {
        List<Contact> result = new ArrayList<Contact>();
        Connection connection = null;

        try{
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from contact");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Contact contact = new Contact();
                contact.setId(resultSet.getLong("id"));
                contact.setFirstName(resultSet.getString("first_name"));
                contact.setLastName(resultSet.getString("last_name"));
                contact.setBirthDate(resultSet.getDate("birth_date"));

                result.add(contact);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally {
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

    }

    @Override
    public void update(Contact contact) {

    }

    @Override
    public void delete(Long contactId) {

    }
}
