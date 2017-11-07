package SoapDirective;

import service.CreateOrder;
import service.ResponseCreateOrder;
import service.TouresBalonService;
import service.UpdateOrderStatus;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://com.javeriana.aes.pica/services/orders")
public class OrdersService {
	
    @EJB
    private TouresBalonService touresBalonService;

    public OrdersService() {
		super();
	}

	@WebMethod(operationName = "createOrder", action = "createOrder")
	public ResponseCreateOrder createOrder(CreateOrder createOrder)  {
		return handleCreateOrder(createOrder);
	}

	@WebMethod(operationName = "updateOrder", action = "updateOrder")
	public Boolean updateOrder(int idOrden, UpdateOrderStatus updateOrderStatus)  {
		return handleUpdateOrderStatus(idOrden, updateOrderStatus);
	}

	private ResponseCreateOrder handleCreateOrder(CreateOrder createOrder) {
		System.out.println("handleCreateOrder");
		ResponseCreateOrder response = touresBalonService.createOrder(createOrder);
		return response;
	}

	private Boolean handleUpdateOrderStatus(int orderId, UpdateOrderStatus updateOrderStatus) {
		System.out.println("handleUpdateOrderStatus");
		updateOrderStatus.setOrderId(orderId);
		boolean response = touresBalonService.updateOrderStatus(updateOrderStatus);
		return response;
	}
	 
}
