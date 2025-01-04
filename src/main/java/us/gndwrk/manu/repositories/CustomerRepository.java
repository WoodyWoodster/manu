package us.gndwrk.manu.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import us.gndwrk.manu.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
  Customer findById(long id);

  List<Customer> findByLastName(String lastName);
}
