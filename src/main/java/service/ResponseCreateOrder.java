package service;

import java.io.Serializable;

/**
 * Created by AHernandezS on 4/11/2017.
 */
public class ResponseCreateOrder implements Serializable{
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
