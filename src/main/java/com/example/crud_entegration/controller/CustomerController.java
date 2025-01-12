package com.example.crud_entegration.controller;

import com.example.crud_entegration.model.Customer;
import com.example.crud_entegration.service.ımpl.CustomerServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class CustomerController {
    private final CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerServiceimpl) {
        this.customerService = customerServiceimpl;
    }

    @GetMapping("/allcustomers")
    public List<Customer> getallcustomer() {

        return customerService.getallcustomers();

    }

    @GetMapping("customers/{id}")
    public Customer getcustomerbyid(@PathVariable(name = "id") String id) {
        return customerService.findbyid(id);
    }

    @PutMapping("customers/{id}")
    public Customer updatecustomer(@RequestBody Customer customer, @PathVariable(name = "id") String id) {
        return customerService.updateCustomer(customer, id);
    }

    @DeleteMapping("/customers/{id}")
    public Customer deleteCustomer(@PathVariable(name = "id") String id) {
        return customerService.deletebyid(id);

    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}
