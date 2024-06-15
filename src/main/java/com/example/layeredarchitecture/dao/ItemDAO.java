package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;
    public void saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public void updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException;

    public boolean checkItem(String code) throws SQLException, ClassNotFoundException;

    public String getNextId() throws SQLException, ClassNotFoundException;

    public ItemDTO searchItem(String newItemCode) throws SQLException, ClassNotFoundException;

    boolean isItemSearchedAndUpdated(Connection connection, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException;
}
