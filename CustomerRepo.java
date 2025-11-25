package com.parcel.tracking.parcelTracking.Repository;

import com.parcel.tracking.parcelTracking.Entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends MongoRepository<Customer,String> {

}
