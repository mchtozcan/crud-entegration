package com.example.crud_entegration.service.ımpl;

import com.example.crud_entegration.model.Customer;
import com.example.crud_entegration.repository.CustomerRepository;
import com.example.crud_entegration.service.ICustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public List<Customer> getallcustomers() {
        return customerRepository.findAll();
    }

    public Customer findbyid(String id) {
        return customerRepository.findById(id).get();
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer, String id) {

 Optional <Customer> customer1= customerRepository.findById(id);
 if (customer1.isPresent()){
     Customer customer2=customer1.get();
     customer2.setFirstname(customer.getFirstname());
     customer2.setLastname(customer.getLastname());
     customer2.setPhone(customer.getPhone());
     customer2.setEmail(customer.getEmail());
     return customerRepository.save(customer2);

 }else
     return customerRepository.save(customer);


    }

    public Customer deletebyid(String id) {
        Customer customer = customerRepository.findById(id).get();

        customerRepository.delete(customer);

        return customer;
    }
}



