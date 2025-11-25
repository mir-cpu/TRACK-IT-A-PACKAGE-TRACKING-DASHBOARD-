package com.parcel.tracking.parcelTracking.Controller;


import com.parcel.tracking.parcelTracking.Entities.ParcelOrder;
import com.parcel.tracking.parcelTracking.Services.ParcelOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parcels")
public class ParcelOrderController {

    @Autowired
    private ParcelOrderService parcelOrderService;

    @PostMapping("/order")
    public ParcelOrder placeOrder(@RequestBody ParcelOrder parcelOrder){
        return parcelOrderService.placeOrder(parcelOrder);

    }
    @GetMapping("/all/orders")
    public List<ParcelOrder> getAllParcels(){
        return parcelOrderService.getAllParcels();
    }
    @GetMapping("/tid/{trackingId}")
    public ParcelOrder getByTrackingId(@PathVariable String trackingId)
    {
        return parcelOrderService.findByTrackingId(trackingId);
    }

    @PutMapping("/{trackingId}/updateorder")
    public ParcelOrder updateOrder(@PathVariable String trackingId, @RequestBody ParcelOrder parcelOrder)
    {
        return parcelOrderService.updateOrder(trackingId,parcelOrder);
    }

    @DeleteMapping("/{trackingId}/deleteorder")
    public String deleteOrder(@PathVariable String trackingId)
    {
        return parcelOrderService.deleteOrder(trackingId);
    }


}
