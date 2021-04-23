package com.ventoday.ecommerce.selleraccountservice.dao.nosql;

import com.ventoday.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SellerBulkInfoRepository extends MongoRepository<SellerBulkInfo, Integer> {
}
