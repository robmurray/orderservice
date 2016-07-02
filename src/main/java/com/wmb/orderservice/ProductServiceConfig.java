package com.wmb.orderservice;

import com.wmb.orderservice.service.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by robertmurray on 7/2/16.
 */
@Configuration
public class ProductServiceConfig {

    @Bean
    public ProductServiceImpl getProductService(){
        return new ProductServiceImpl();
    }



}
