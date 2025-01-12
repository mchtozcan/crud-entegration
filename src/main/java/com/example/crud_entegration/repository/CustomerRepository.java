package com.example.crud_entegration.repository;

import com.example.crud_entegration.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
