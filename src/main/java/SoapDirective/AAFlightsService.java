package SoapDirective;

import service.CreateOrderRequest;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://com.javeriana.aes.pica/services/orders")
public class AAFlightsService {

	private static int order = 0;

	@WebMethod(operationName = "createOrder", action = "createOrder")
	public int createOrder(CreateOrderRequest createOrderRequest)  {
		return order++;
	}

	@WebMethod(operationName = "cancelOrder", action = "cancelOrder")
	public Boolean updateOrder(int orderId)  {
		return true;
	}
}
