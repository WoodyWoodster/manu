package us.gndwrk.manu.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import us.gndwrk.manu.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
  Customer findById(long id);

  List<Customer> findByLastName(String lastName);
}
