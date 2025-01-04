package us.gndwrk.manu.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import us.gndwrk.manu.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
  List<Customer> findByLastName(String lastName);
  Customer findById(long id);
}
