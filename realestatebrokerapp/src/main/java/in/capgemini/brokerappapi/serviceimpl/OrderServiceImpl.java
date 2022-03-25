package in.capgemini.brokerappapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.capgemini.brokerappapi.domain.Order;
import in.capgemini.brokerappapi.exception.OrderIdException;
import in.capgemini.brokerappapi.repository.OrderRepository;
import in.capgemini.brokerappapi.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public Order addorUpdate(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public Order deleteOrderByOrderIdentifier(String orderId) {
		// TODO Auto-generated method stub
		Order order=orderRepository.findByOrderIdentifier(orderId.toUpperCase());
		if(order==null) {
			throw new OrderIdException("order Identifier: "+orderId.toUpperCase()+" Does nor exist");
		}
		orderRepository.delete(order);
		return order;
	}

	@Override
	public Iterable<Order> findAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order findOrderByOrderIdentifier(String orderId) {
		// TODO Auto-generated method stub
		Order order=orderRepository.findByOrderIdentifier(orderId.toUpperCase());
		if(order==null) {
			throw new OrderIdException("order Identifier: "+orderId.toUpperCase()+" Does nor exist");
		}
		return order;
	}
	
	

}
