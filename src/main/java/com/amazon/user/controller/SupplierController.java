package com.amazon.user.controller;

import com.amazon.user.model.Supplier;
import com.amazon.user.repo.SupplierRepository;
import com.amazon.user.service.SupplierService;
import com.amazon.user.service.serviceImpl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierServiceImpl supplierService;

    @PostMapping("/createSupplier")
    public ResponseEntity<Supplier> createSeller(@RequestBody Supplier supplier){

        ResponseEntity response = null;
        Supplier supplier1 = supplierService.createSeupplier(supplier);
        response = ResponseEntity.status(200).body(supplier1);
        return response;
    }
}
