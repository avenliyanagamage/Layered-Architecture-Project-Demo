package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

    public void saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public void updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public boolean checkCustomer(String id) throws SQLException, ClassNotFoundException;

    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    public String getNewId() throws SQLException, ClassNotFoundException;

    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException;
}
