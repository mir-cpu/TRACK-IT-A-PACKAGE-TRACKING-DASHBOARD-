package com.parcel.tracking.parcelTracking.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "parcelOrders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParcelOrder {

    @Id
    private String id;
    @Field("track_id")
    private String trackingId;
    @Field("customer_id")
    private String customerId;
    private String status;
    private String source;
    private String destination;
    private LocalDateTime orderDate;
    private LocalDateTime dateOfDelivery;
}
