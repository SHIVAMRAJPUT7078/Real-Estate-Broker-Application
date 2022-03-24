package in.capgemini.brokerappapi.repository;

import org.springframework.data.repository.CrudRepository;

import in.capgemini.brokerappapi.domain.Order;

public interface OrderRepository extends CrudRepository<Order, String>{
  Order findByOrderIdentifier(String orderIdentifier);
}
