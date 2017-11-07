package service;

import model.Order;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class TouresBalonDBService implements TouresBalonService {

    @PersistenceContext(unitName = "orders-pu")
    private EntityManager entityManager;

    @Override
    public ResponseCreateOrder createOrder(CreateOrderRequest createOrder) {
        System.out.println("Hibernate one to many (XML Mapping)");

        Order order = new Order();
        order.setOrderDate(new Date());
        order.setPrice(createOrder.getPrice());
        order.setStatus("EN VALIDACION");
        order.setUserId(createOrder.getUserId());
        entityManager.persist(order);

        for (Item item :  createOrder.getItems()) {
            model.OrderItem orderItem = new model.OrderItem(item.getProductId(), item.getProductName(), item.getPrice(), item.getQuantity(), order);
            order.getOrderItem().add(orderItem);
        }

        ResponseCreateOrder responseCreateOrder = new ResponseCreateOrder();
        responseCreateOrder.setOrderId(order.getId());

        System.out.println("Done " + order.getId());
        return responseCreateOrder;

    }

    @Override
    public boolean updateOrderStatus(UpdateOrderStatus updateOrderStatus) {
        Order order = entityManager.find(Order.class, updateOrderStatus.getOrderId());
        order.setStatus(updateOrderStatus.getStatus());
        entityManager.persist(order);
        return true;
    }
}
