package us.gndwrk.manu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import us.gndwrk.manu.entities.Customer;
import us.gndwrk.manu.repositories.CustomerRepository;

@Service
public class CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public Customer createCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  public void deleteCustomer(Long id) {
    customerRepository.deleteById(id);
  }

  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }

  public Customer getCustomerById(Long id) {
    return customerRepository.findById(id).orElse(null);
  }

  public List<Customer> getCustomersByLastName(String lastName) {
    return customerRepository.findByLastName(lastName);
  }
}
