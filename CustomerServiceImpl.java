package com.parcel.tracking.parcelTracking.Services;

import com.parcel.tracking.parcelTracking.Entities.Customer;
import com.parcel.tracking.parcelTracking.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerrepo;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerrepo.save(customer);

    }
}
