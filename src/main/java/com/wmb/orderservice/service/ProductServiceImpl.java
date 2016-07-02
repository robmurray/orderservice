package com.wmb.orderservice.service;

import com.wmb.orderservice.model.Catalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robertmurray on 7/2/16.
 */
public class ProductServiceImpl {

    public List<Catalog> retrieveCatalogs(){
        List<Catalog> retList = new ArrayList<Catalog>();
        retList.add(new Catalog("cloths"));
        retList.add(new Catalog("tools"));
        retList.add(new Catalog("health"));
        retList.add(new Catalog("books"));
        return retList;
    }
    public Catalog retrieveCatalogs(long catalogId){
        return new Catalog("books");
    }
}
