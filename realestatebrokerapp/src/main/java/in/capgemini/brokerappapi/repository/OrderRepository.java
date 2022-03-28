//step 2
package in.capgemini.brokerappapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.capgemini.brokerappapi.domain.Order1;

@Repository
public interface OrderRepository extends CrudRepository<Order1, Long>{
  Order1 findByOrderIdentifier(String orderIdentifier);
  Order1 deleteOrderByOrderIdentifier(String orderIdentifier);
}
