package org.example;

import java.sql.Connection;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Connection con = Connections.getCon();
//        DAO.selectQuery(con);

        Scanner sc = new Scanner(System.in);
        System.out.println("1.selectQuery");
        System.out.println("2.insertQuery");
        System.out.println("3.updateQuery");
        System.out.println("4.deleteQuery");
        System.out.println("Enter your Choice : ");
        int Choice =sc.nextInt();
        switch (Choice){
            case 1:
                DAO.selectQuery(con);
                break;
            case 2:
                System.out.println("enter order_id : ");
                int orderId = sc.nextInt();
                sc.nextLine();
                System.out.println("enter cust_name : ");
                String custName = sc.nextLine();
                System.out.println("enter Deliver_Address : ");
                String deliverAddress =sc.nextLine();
                System.out.println("enter items : ");
                String items = sc.nextLine();
                System.out.println("enter quantity : ");
                int quantity =sc.nextInt();
                sc.nextLine();
                System.out.println("enter price : ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("enter Status : ");
                String status = sc.nextLine();
                System.out.println("enter payment_Mode : ");
                String paymentMode =sc.nextLine();

                Orders o1 = new Orders();

                o1.setOrder_id(orderId);
                o1.setCust_name(custName);
                o1.setDeliver_Address(deliverAddress);
                o1.setItems(items);
                o1.setQuantity(quantity);
                o1.setPrice(price);
                o1.setStatuss(status);
                o1.setPayment_Mode(paymentMode);
                DAO.insertQuery(con,o1);
                DAO.selectQuery(con);
                break;
            case 3:
                System.out.println("Enter order_id to update: ");
                int OrderId = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter new cust_name: ");
                String newCustName = sc.nextLine();
                System.out.println("Enter new Deliver_Address: ");
                String newDeliverAddress = sc.nextLine();
                System.out.println("Enter new items: ");
                String newItems = sc.nextLine();
                System.out.println("Enter new quantity: ");
                int newQuantity = sc.nextInt();
                System.out.println("Enter new price: ");
                double newPrice = sc.nextDouble();
                System.out.println("Enter new Status: ");
                String newStatus = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter new payment_Mode: ");
                String newPaymentMode = sc.nextLine();

                Orders o2 = new Orders();
                o2.setOrder_id(OrderId);
                o2.setCust_name(newCustName);
                o2.setDeliver_Address(newDeliverAddress);
                o2.setItems(newItems);
                o2.setQuantity(newQuantity);
                o2.setPrice(newPrice);
                o2.setStatuss(newStatus);
                o2.setPayment_Mode(newPaymentMode);
                DAO.updateQuery(con, o2);
                DAO.selectQuery(con);
                break;
            case 4:
                System.out.println("Enter order_id to Delete: ");
                int OrderId1 = sc.nextInt();
                Orders o3 = new Orders();
                o3.setOrder_id(OrderId1);
                DAO.deleteQuery(con,o3);
                DAO.selectQuery(con);
                break;
//            default:
//                System.out.println("Enter valid choice");
        }

    }
}
