//third step
package in.capgemini.brokerappapi.service;

import in.capgemini.brokerappapi.domain.Order;

public interface OrderService {
  public Order addorUpdate(Order order);
  //public Order deleteOrderByOrderIdentifier(String orderId);
  //public Iterable<Order> findAllOrder();
  //public Order findOrderByOrderIdentifier(String orderId);
}
