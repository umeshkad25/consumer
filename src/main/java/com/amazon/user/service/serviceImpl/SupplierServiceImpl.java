package com.amazon.user.service.serviceImpl;

import com.amazon.user.model.Product;
import com.amazon.user.model.Supplier;
import com.amazon.user.repo.SupplierRepository;
import com.amazon.user.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepository supplierRepo;

    public Supplier createSeupplier(Supplier supplier){
        for (Product product : supplier.getProductList()) {
            product.setSupplier(supplier);
        }
        return supplierRepo.save(supplier);
    }

}
