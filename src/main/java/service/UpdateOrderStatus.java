package service;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by AHernandezS on 4/11/2017.
 */
@XmlRootElement
public class UpdateOrderStatus {
    private int orderId;
    private String status;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
