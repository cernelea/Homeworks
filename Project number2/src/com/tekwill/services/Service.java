package com.tekwill.services;

import com.tekwill.model.Product;
import com.tekwill.model.Shoe;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Service<K, V> implements Modifiable<K, V> {

    Map<K, T> shoeMap = new HashMap<>();

    @Override
    public void create(K id, String name, Double size, String type) {
       
    }

    @Override
    public T find(K id) {
     
    }

    @Override
    public T find(String name) {
 
    }

    @Override
    public T update(K id, Integer newId, String name, Double size, String type) {
  
    }

    @Override
    public void delete(K id) {

    }

        
        
    


}
