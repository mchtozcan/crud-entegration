package com.example.crud_entegration.service;

import com.example.crud_entegration.model.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICustomerService {

    Customer findbyid(String id);

   Customer updateCustomer(Customer customer, String id);

    Customer deletebyid(String id);

    Customer addCustomer(Customer customer);

    List<Customer> getallcustomers();
}
