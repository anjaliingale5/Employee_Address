package com.Geekster.Employee.address.service;

import com.Geekster.Employee.address.model.Address;
import com.Geekster.Employee.address.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public List<Address> getAllAddresses() {
       return iAddressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return iAddressRepo.findById(id);
    }

    public String createAddress(Address address) {

        iAddressRepo.save(address);
        return "add address";
    }

    public Address updateAddress(Long id, Address address) {
       boolean add1 = iAddressRepo.existsById(id);
       if(add1){
           iAddressRepo.save(address);
       }
        return address;
    }

    public void deleteAddress(Long id) {
        iAddressRepo.findById(id);
    }
}
