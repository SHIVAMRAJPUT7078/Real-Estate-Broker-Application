package in.capgemini.brokerappapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.capgemini.brokerappapi.domain.Order1;
import in.capgemini.brokerappapi.exception.OrderIdException;
import in.capgemini.brokerappapi.repository.OrderRepository;
import in.capgemini.brokerappapi.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public Order1 saveorUpdate(Order1 order) {
		// TODO Auto-generated method stub
		try {
		order.setOrderIdentifier(order.getOrderIdentifier().toUpperCase());	
		return orderRepository.save(order);
		}
		catch(Exception ex) {
			throw new OrderIdException("Order Id: "+order.getOrderIdentifier().toUpperCase()+" already exists");
		}
	}
	
	@Override
	public Order1 findOrderByOrderIdentifier(String orderId) {
		// TODO Auto-generated method stub
		Order1 order=orderRepository.findByOrderIdentifier(orderId.toUpperCase());
		if(order==null) {
			throw new OrderIdException("order Identifier: "+orderId.toUpperCase()+" Does not exist");
		}
		return order;
	}

	@Override
	public void deleteOrderByOrderIdentifier(String orderId) {
		// TODO Auto-generated method stub
		Order1 order=orderRepository.findByOrderIdentifier(orderId.toUpperCase());
		if(order==null) {
			throw new OrderIdException("order Identifier: "+orderId.toUpperCase()+" Does not exist");
		}
		orderRepository.delete(order);
	}

	@Override
	public Iterable<Order1> findAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}


	
	

}
