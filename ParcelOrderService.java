package com.parcel.tracking.parcelTracking.Services;

import com.parcel.tracking.parcelTracking.Entities.ParcelOrder;

import java.util.List;


public interface ParcelOrderService {
    public ParcelOrder placeOrder(ParcelOrder parcelOrder);

    List<ParcelOrder> getAllParcels();

    public ParcelOrder findByTrackingId(String trackingId);

    ParcelOrder updateOrder(String trackingId, ParcelOrder parcelOrder);

    String deleteOrder(String trackingId);
}
