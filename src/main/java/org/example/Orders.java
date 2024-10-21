package org.example;

public class Orders {
    private int order_id;
    private String cust_name;
    private String Deliver_Address;
    private String items;
    private  int quantity;
    private double price;
    private String Statuss;
    private String payment_Mode;


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getDeliver_Address() {
        return Deliver_Address;
    }

    public void setDeliver_Address(String deliver_Address) {
        Deliver_Address = deliver_Address;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatuss() {
        return Statuss;
    }

    public void setStatuss(String statuss) {
        Statuss = statuss;
    }

    public String getPayment_Mode() {
        return payment_Mode;
    }

    public void setPayment_Mode(String payment_Mode) {
        this.payment_Mode = payment_Mode;
    }
}
