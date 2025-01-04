package us.gndwrk.erp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import us.gndwrk.erp.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
  List<Customer> findByLastName(String lastName);
  Customer findById(long id);
}
