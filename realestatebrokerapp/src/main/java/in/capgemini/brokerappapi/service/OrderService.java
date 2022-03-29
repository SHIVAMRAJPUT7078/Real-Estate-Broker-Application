//third step
package in.capgemini.brokerappapi.service;

import in.capgemini.brokerappapi.domain.Order1;

public interface OrderService {
  public Order1 saveorUpdate(Order1 order);
  public Order1 findOrderByOrderIdentifier(String orderId);
  public void deleteOrderByOrderIdentifier(String orderId);
  public Iterable<Order1> findAllOrder();
 
}
