package com.amazon.user.model;


import jakarta.persistence.*;

import java.util.List;
import java.util.Map;

@Entity
public class Supplier {

    @Id
    @Column(name = "mobile_no")
    private String mobileNo;


    private String sellerName;
    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    private List<Product> productList;
//    private Map<String,Integer> stock;



    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerId() {
        return mobileNo;
    }

    public void setSellerId(String sellerId) {
        this.mobileNo = sellerId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

//    public Map<String, Integer> getStock() {
//        return stock;
//    }
//
//    public void setStock(Map<String, Integer> stock) {
//        this.stock = stock;
//    }
}
