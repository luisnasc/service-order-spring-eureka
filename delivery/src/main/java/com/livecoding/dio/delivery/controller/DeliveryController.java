package com.livecoding.dio.delivery.controller;

import com.livecoding.dio.delivery.exception.ResourceNotFoundException;
import com.livecoding.dio.delivery.model.Delivery;
import com.livecoding.dio.delivery.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class DeliveryController {

    @Autowired
    private DeliveryRepository deliveryRepository;


    @GetMapping("/delivery")
    public List<Delivery> getAllDelivery(){
        return deliveryRepository.findAll();
    }

    @GetMapping("/delivery/{id}")
    public ResponseEntity<Delivery> getDeliveryById(@PathVariable(value="id") Long deliveryId) throws ResourceNotFoundException {
        Delivery delivery = deliveryRepository.findById(deliveryId).orElseThrow( ()-> new ResourceNotFoundException("Order not found: "+deliveryId) );
        return  ResponseEntity.ok().body(delivery);
    }

    @PostMapping("/delivery")
    public Delivery createDelivery(@Valid @RequestBody Delivery delivery){
        return deliveryRepository.save(delivery);
    }

    @PutMapping("/delivery/{id}")
    public ResponseEntity<Delivery> updateDelivery(@PathVariable(value = "id") Long deliveryId, @Valid @RequestBody Delivery deliveryDetails) throws ResourceNotFoundException {
        Delivery delivery = deliveryRepository.findById(deliveryId).orElseThrow(()-> new ResourceNotFoundException("Customer not found: "+deliveryId) );
        delivery.setAddress(deliveryDetails.getAddress());
        delivery.setCustomerId(deliveryDetails.getCustomerId());
        delivery.setOrderId(deliveryDetails.getOrderId());
        delivery.setShippingValue(deliveryDetails.getShippingValue());

        final Delivery updatedDelivery = deliveryRepository.save(delivery);
        return ResponseEntity.ok(updatedDelivery);

    }

    @DeleteMapping("/delivery/{id}")
    public Map<String, Boolean> deleteDelivery(@PathVariable(value="id") Long deliveryId) throws ResourceNotFoundException {
        Delivery delivery = deliveryRepository.findById(deliveryId).orElseThrow( ()-> new ResourceNotFoundException("Customer not found: "+deliveryId) );
        deliveryRepository.delete(delivery);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }



}
