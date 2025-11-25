package com.parcel.tracking.parcelTracking.Services;

import com.parcel.tracking.parcelTracking.Entities.ParcelOrder;
import com.parcel.tracking.parcelTracking.Repository.ParcelOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcelOrderServiceImpl implements ParcelOrderService{
    @Autowired
    private ParcelOrderRepo parcelOrderRepo;

    public ParcelOrder placeOrder(ParcelOrder parcelOrder) {
        return parcelOrderRepo.save(parcelOrder);
    }

    @Override
    public List<ParcelOrder> getAllParcels() {
        return parcelOrderRepo.findAll();
    }

    @Override
    public ParcelOrder findByTrackingId(String trackingId) {
        return parcelOrderRepo.findByTrackingId(trackingId);
    }

    @Override
    public ParcelOrder updateOrder(String trackingId, ParcelOrder parcelOrder) {

        ParcelOrder existingOrder = parcelOrderRepo.findByTrackingId(trackingId);
        existingOrder.setStatus(parcelOrder.getStatus());
        existingOrder.setSource(parcelOrder.getSource());
        existingOrder.setDestination(parcelOrder.getDestination());
        existingOrder.setOrderDate(parcelOrder.getOrderDate());
        existingOrder.setDateOfDelivery(parcelOrder.getDateOfDelivery());

        return parcelOrderRepo.save(existingOrder);

    }

    @Override
    public String deleteOrder(String trackingId) {
        parcelOrderRepo.deleteById(trackingId);
        return "Successfully deleted the order with id :" + trackingId;

    }
}
