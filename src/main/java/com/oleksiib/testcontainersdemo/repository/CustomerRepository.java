package com.oleksiib.testcontainersdemo.repository;

import com.oleksiib.testcontainersdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
