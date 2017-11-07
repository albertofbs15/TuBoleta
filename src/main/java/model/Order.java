package model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by AHernandezS on 5/11/2017.
 */
public class Order implements Serializable {
    private Integer id;
    private Date orderDate;
    private int price;
    private String status;
    private int userId;
    private Set<OrderItem> orderItem = new HashSet<OrderItem>(0);

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Set<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Set<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

}
