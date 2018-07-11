package com.tekwill.services;

import com.tekwill.model.*;
import java.util.ArrayList;
import java.util.List;

public class ShoeService {

    List<Product> shoeList = new ArrayList();

    private void privateMethod(Integer id, String name, double size, String type) {
        Product shoe = new Shoe(id, name, size, type);
        shoeList.add(shoe);

    }

    public void create(Integer id, String name, double size, String type) {
        this.privateMethod(id, name, size, type);

    }

    public Product find(String name) {
        for (Product product : shoeList) {
            if (product.getName() == name) {

                return product;
            }

        }
        return null;

    }

    public Product find(Integer id) {

        for (Product product : shoeList) {
            if (product.getId() == id) {

                return product;
            }

        }

        return null;
    }

    public Product update(Integer id, int newId, String name, double size, String type) {

        Product foundById = this.find(id);
        for (Product product : shoeList) {

            if (foundById != null && product.getId() == id) {

                foundById.setId(newId);
                foundById.setName(name);
                foundById.setSize(size);
                foundById.setType(type);
                return foundById;

            }
        }
        return null;
    }

    public void delete(Integer id) {

        Product foundById = this.find(id);
//        if (foundById != null) {
        shoeList.remove(foundById);

//        
    }

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
        for (Product product : shoeList) {
            System.out.println(product);
        }
    }
}
