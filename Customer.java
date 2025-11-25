package com.parcel.tracking.parcelTracking.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "customers")
@Data
public class Customer {

    @Id
    private String id;

    private String customerId;
    private String name;
    private String email;
    private String password;
    private String contact;
}
