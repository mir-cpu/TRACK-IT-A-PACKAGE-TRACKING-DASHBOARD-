package com.parcel.tracking.parcelTracking.Controller;

import com.fasterxml.jackson.databind.introspect.Annotated;
import com.parcel.tracking.parcelTracking.Entities.Customer;
import com.parcel.tracking.parcelTracking.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parcel/track")
public class CustomerController
{
    @Autowired
    private CustomerService customerservice;

    @PostMapping("/signup")
    public Customer signup(@RequestBody Customer customer){
        return customerservice.saveCustomer(customer);

    }
}
