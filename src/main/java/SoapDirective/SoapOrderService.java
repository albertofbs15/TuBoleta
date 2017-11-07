package SoapDirective;

import service.CreateOrderRequest;
import service.ResponseCreateOrder;
import service.TouresBalonService;
import service.UpdateOrderStatus;
import service.ClientStatus;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://com.javeriana.aes.pica/services/orders")
public class SoapOrderService {
	
    @EJB
    private TouresBalonService touresBalonService;

	final  String PLATINO = "PLATINO";
	final  String DORADO = "DORADO";
	final  String PLEATEADO = "PLATEADO";
	final int MONTO = 20000;

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

	@WebMethod(operationName = "validateClientStatusOperation", action = "validateClientStatusOperation")
	public Boolean validateClientStatusForOperation(ClientStatus clientStatus)  {
		return handleValidateClientStatus(clientStatus);
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

	private Boolean handleValidateClientStatus(ClientStatus clientStatus) {
		System.out.println("handleValidateClientStatus");
		if (clientStatus.getTipoCliente().equals(PLATINO)) {
			return true;
		} else if (clientStatus.getTipoCliente().equals(DORADO) && clientStatus.getMonto() <= MONTO) {
			return true;
		}

		return false;
	}
	 
}
