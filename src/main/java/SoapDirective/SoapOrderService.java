package SoapDirective;

import service.CreateOrderRequest;
import service.ResponseCreateOrder;
import service.TouresBalonService;
import service.UpdateOrderStatus;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://com.javeriana.aes.pica/services/orders")
public class SoapOrderService {
	
    @EJB
    private TouresBalonService touresBalonService;

    public SoapOrderService() {
		super();
	}

	@WebMethod(operationName = "createOrder", action = "createOrder")
	public ResponseCreateOrder createOrder(CreateOrderRequest createOrder)  {
		return handleCreateOrder(createOrder);
	}

	@WebMethod(operationName = "updateOrder", action = "updateOrder")
	public Boolean updateOrder(UpdateOrderStatus updateOrderStatus)  {
		return handleUpdateOrderStatus(updateOrderStatus);
	}

	private ResponseCreateOrder handleCreateOrder(CreateOrderRequest createOrder) {
		System.out.println("handleCreateOrder");
		ResponseCreateOrder response = touresBalonService.createOrder(createOrder);
		return response;
	}

	private Boolean handleUpdateOrderStatus(UpdateOrderStatus updateOrderStatus) {
		System.out.println("handleUpdateOrderStatus");
		return  touresBalonService.updateOrderStatus(updateOrderStatus);
	}
	 
}
