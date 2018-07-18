package com.tekwill.services;

import com.tekwill.model.*;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShoeService implements Modifiable {

    private Map<Integer, Product> shoeMap = new LinkedHashMap<Integer, Product>();

    private void privateMethod(Integer key, Integer id, String name, double size, String type) {
        Product shoe = new Shoe(id, name, size, type);
        shoeMap.put(key, shoe);
        
        

    }

    public void create(Integer key, Integer id, String name, double size, String type) {
        this.privateMethod(key, id, name, size, type);

    }

    private Product findKey(int key) {
        if (shoeMap.containsKey(key)) {
            return shoeMap.get(key);
        }
        return null;
    }

    public Product find(int key) {

        return this.findKey(key);
    }

    public Product find(Product product) {
        if (shoeMap.containsValue(product)) {
            return product;

        }

        return null;

    }

    public Product find(Product product, String name) {
        Product foundByProduct = this.find(product);
        if (foundByProduct != null && foundByProduct.getName() == name) {

            return foundByProduct;
        }
        return null;

    }
    
   

    public Product find(Product product, int id) {
        Product foundByProduct = this.find(product);
        if (foundByProduct != null && foundByProduct.getId() == id) {
            return foundByProduct;

        }

        return null;

    }

    public Product find(int key, int id) {
        Product foundBykey = this.find(key);
        if (foundBykey != null && foundBykey.getId() == id) {

            return foundBykey;
        }
        return null;

    }

    @Override
    public Product find(Double id) {
        Collection<Product> productSet = shoeMap.values();

        for (Product product : productSet) {

            if (product != null && product.getId() == id) {

                return product;

            }

        }
        return null;
    }

    public Product find(String name) {
        Collection<Product> productSet = shoeMap.values();
        for (Product product : productSet) {
            if (product != null && product.getName().equals(name)) {

                return product;
            }

        }
        return null;

    }

    public Product update(Integer id, int newId, String name, double size, String type) {
        Product foundById = this.find(id);
        if (foundById != null) {
            foundById.setId(newId);
            foundById.setName(name);
            foundById.setSize(size);
            foundById.setType(type);
            return foundById;

        }

        return null;

    }

    public Product update(int key, int id, String name, double size, String type) {
        Product newShoe = new Shoe(id, name, size, type);
        return shoeMap.replace(key, newShoe);

    }

    public void delete(Integer key) {
        shoeMap.remove(key);

    }

//    public void delete(Integer id) {
//
//        Product foundById = this.find(id);
////        if (foundById != null) {
//        shoeList.remove(foundById);
//
////        
//    }
//
//    public void delete(Integer id) {
//        Product foundbyId = this.find(id);
//
//    }
//    public Product[] shoeList = new Shoe[3];
//    Scanner input = new Scanner(System.in);
//    public void create(Integer id, String name, double size, String type) {
//
//        Product shoe = new Shoe(id, name, size, type);
//
//        try {
//            shoeList[id] = shoe;
//
//        } catch (ArrayIndexOutOfBoundsException arrOut) {
//
//            System.out.println("Too many objects created in shoeList[] please check again ");
//
//        }
//    }
//
//    public Product find(Integer id) {
//
//        for (Product product : shoeList) {
//
//            if (product != null && product.getId() == id) {
//
//                return product;
//
//            }
//
//        }
//        return null;
//    }
//
//    public Product find(String name) {
//        for (Product product : shoeList) {
//            if (product != null && product.getName().equals(name)) {
//
//                return product;
//
//            }
//
//        }
//        return null;
//
//    }
//
//    public void delete(Integer id) {
//        System.out.println("Delete operation in shoeService");
//        Product foundById = this.find(id);
//        System.out.println(foundById);
//        if (foundById != null) {
//            System.out.println("The element was found");
//            int i = 0;
//            for (Product product : shoeList) {
//
//                if (product != null && product.getId() == id) {
//                    System.out.println("Found object with id " + id);
//                    shoeList[i] = null;
//
//                }
//
//                i++;
//            }
//
//        }
//
//    }
//
//    public Product update(Integer id, String name, double size, String type) {
//        Product foundById = this.find(id);
//        if (foundById != null) {
//
//            foundById.setName(name);
//            foundById.setSize(size);
//            foundById.setType(type);
//            return foundById;
//
//        }
//        return null;
//    }
//
    public void showShoeList() {
        System.out.println(shoeMap.values());
        System.out.println(shoeMap.keySet());
    }

}
