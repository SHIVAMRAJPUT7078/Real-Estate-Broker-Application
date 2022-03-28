package in.capgemini.brokerappapi.repository;

import org.springframework.data.repository.CrudRepository;

import in.capgemini.brokerappapi.domain.Category;


public interface CategoryRepository  extends CrudRepository<Category, Long>{


}
