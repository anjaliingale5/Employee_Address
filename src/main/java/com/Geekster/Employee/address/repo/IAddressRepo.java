package com.Geekster.Employee.address.repo;

import com.Geekster.Employee.address.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Long> {
}
