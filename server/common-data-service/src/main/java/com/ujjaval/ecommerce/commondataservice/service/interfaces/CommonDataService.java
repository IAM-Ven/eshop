package com.ventoday.ecommerce.commondataservice.service.interfaces;

import com.ventoday.ecommerce.commondataservice.dto.ProductInfoDTO;
import com.ventoday.ecommerce.commondataservice.entity.sql.info.ProductInfo;
import com.ventoday.ecommerce.commondataservice.model.FilterAttributesResponse;
import com.ventoday.ecommerce.commondataservice.model.HomeTabsDataResponse;
import com.ventoday.ecommerce.commondataservice.model.MainScreenResponse;
import com.ventoday.ecommerce.commondataservice.model.SearchSuggestionResponse;

import java.util.HashMap;
import java.util.List;

public interface CommonDataService {

    MainScreenResponse getHomeScreenData(String apiName);

    FilterAttributesResponse getFilterAttributesByProducts(String queryParams);

    ProductInfoDTO getProductsByCategories(String queryParams);

    HashMap<Integer, ProductInfo> getProductsById(String queryParams);

    HomeTabsDataResponse getBrandsAndApparelsByGender(String apiName);

    SearchSuggestionResponse getSearchSuggestionList();
}

