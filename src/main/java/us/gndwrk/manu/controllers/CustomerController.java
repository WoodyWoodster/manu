package us.gndwrk.manu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import us.gndwrk.manu.entities.Customer;
import us.gndwrk.manu.services.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @PostMapping
  public Customer createCustomer(@RequestBody Customer customer) {
    return customerService.createCustomer(customer);
  }

  @GetMapping
  public List<Customer> getAllCustomers() {
    return customerService.getAllCustomers();
  }

  @GetMapping("/{id}")
  public Customer getCustomerById(@PathVariable Long id) {
    return customerService.getCustomerById(id);
  }

}
