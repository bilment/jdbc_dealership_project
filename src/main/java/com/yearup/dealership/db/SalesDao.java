package com.yearup.dealership.db;

import com.yearup.dealership.models.SalesContract;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalesDao {
    private DataSource dataSource;

    public SalesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void addSalesContract(SalesContract salesContract) {
        String sql = "INSERT INTO sales_contracts (VIN, sale_date, price) VALUES (?, ?, ?)";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, salesContract.getVin());
            statement.setDate(2, java.sql.Date.valueOf(salesContract.getSaleDate()));
            statement.setDouble(3, salesContract.getPrice());

            statement.executeUpdate();

            System.out.println("Sales contract added successfully.");
        } catch (SQLException e) {
            System.err.println("Error adding sales contract: " + e.getMessage());
        }
    }
}
