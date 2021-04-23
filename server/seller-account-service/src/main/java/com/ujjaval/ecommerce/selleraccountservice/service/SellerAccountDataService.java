package com.ventoday.ecommerce.selleraccountservice.service;


import com.ventoday.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;
import com.ventoday.ecommerce.selleraccountservice.entity.sql.SellerInfo;

public interface SellerAccountDataService {

    public SellerInfo findSellerById(Integer sellerId);

    public void save();

    public void saveInMongo();

    public SellerBulkInfo findMongoAddressById();
}

