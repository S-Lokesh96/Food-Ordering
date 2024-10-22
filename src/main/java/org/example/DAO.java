package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    public static void selectQuery(Connection conn){
        try{
            String query = "select * from FoodOrder.orderDetails";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            while (result.next()){
                int order_id = result.getInt(1);
                String cust_name = result.getString(2);
                String Deliver_Address =result.getString(3);
                String items=result.getString(4);
                int quantity = result.getInt(5);
                double price = result.getDouble(6);
                String Statuss=result.getString(7);
                String payment_Mode=result.getString(8);
                System.out.println("order_id : "+order_id+"  cust_name : "+cust_name+"  Deliver_Address : "
                        +Deliver_Address+"  items : "+items+"  quantity : "+quantity+"  price : "
                +price+"  Status : "+Statuss+"  payment_Mode : "+payment_Mode);
            }
            System.out.println("record extracted");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
    public static void insertQuery(Connection conn,Orders o1){
        try{
            String query = "insert into FoodOrder.orderDetails values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,o1.getOrder_id());
            ps.setString(2, o1.getCust_name());
            ps.setString(3,o1.getDeliver_Address());
            ps.setString(4, o1.getItems());
            ps.setInt(5,o1.getQuantity());
            ps.setDouble(6,o1.getPrice());
            ps.setString(7, o1.getStatuss());
            ps.setString(8,o1.getPayment_Mode());
            ps.execute();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public static void updateQuery(Connection conn,Orders o2){
        try {
            String query = "UPDATE FoodOrder.orderDetails SET cust_name = ?, Deliver_Address = ?, items = ?, quantity = ?, price = ?, Statuss = ?, payment_Mode = ? WHERE order_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, o2.getCust_name());
            ps.setString(2, o2.getDeliver_Address());
            ps.setString(3, o2.getItems());
            ps.setInt(4, o2.getQuantity());
            ps.setDouble(5, o2.getPrice());
            ps.setString(6, o2.getStatuss()); 
            ps.setString(7, o2.getPayment_Mode()); 
            ps.setInt(8, o2.getOrder_id()); 

            ps.executeUpdate();
            System.out.println("record Updated");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deleteQuery(Connection conn,Orders o3){
        try {
            String query = " delete from FoodOrder.orderDetails where order_id =?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,o3.getOrder_id());
            ps.execute(); // or ps.executeUpdate();
            System.out.println("record delete successfully");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
