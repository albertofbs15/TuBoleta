package model;

import java.io.Serializable;

/**
 * Created by AHernandezS on 5/11/2017.
 */
public class OrderItem implements Serializable {
    private Integer id;
    private int productId;
    private String productName;
    private int price;
    private int quantity;
    private Order order;

    public OrderItem() {
    }

    public OrderItem(int productId, String productName, int price, int quantity, Order order) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
