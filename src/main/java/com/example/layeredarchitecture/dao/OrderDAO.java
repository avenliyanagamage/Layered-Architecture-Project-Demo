package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface OrderDAO {
    public String getNextId() throws SQLException, ClassNotFoundException;
    public boolean isOrderPlaced(String orderId, LocalDate orderDate, String customerId, List<OrderDetailDTO> orderDetails);
}
