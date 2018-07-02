//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.tekwill.services;

import com.tekwill.model.*;
import java.util.Scanner;

/**
 *
 * @since Jun 27, 2018
 * @author sscerbatiuc
 */
public class ShoeService implements Modifiable {

    private Product[] shoeList = new Shoe[3];
    Scanner input = new Scanner(System.in);

//  public void create()
//  {
//    Product nike;
//    for (int i = 0; i < shoeList.length; i++)
//    {
//      System.out.println("introdu stringul");
//      String ceva1 = input.nextLine();
//      System.out.println("Introdu double");
//      double ceva2 = input.nextDouble();
//
//      nike = new Shoe(i, ceva1, ceva2);
//      String ceva3 = input.nextLine();
//      nike.setType("sport");
//      shoeList[i] = nike;
//      System.out.print(nike);
//
//    }
//
//  }
//
//  public void find()
//  {
//
//    int id = 0;
//    System.out.println("Enter id:");
//    if (input.hasNextInt())
//    {
//
//      id = input.nextInt();
//
//      switch (id)
//      {
//
//        case 0:
//          System.out.println(shoeList[0]);
//          break;
//        case 1:
//          System.out.println(shoeList[1]);
//          break;
//        case 2:
//          System.out.println(shoeList[2]);
//          break;
//        case 3:
//          System.out.println(shoeList[3]);
//          break;
//        case 4:
//          System.out.println(shoeList[4]);
//          break;
//
//      }
//
//    }
//    else
//    {
//      System.out.println("Enter a valid id.");
//    }
//
//  }
//
//  public void delete()
//  {
//    int id = 0;
//    System.out.println("Enter id:");
//    if (input.hasNextInt())
//    {
//
//      id = input.nextInt();
//
//      switch (id)
//      {
//
//        case 0:
//          shoeList[0] = null;
//          break;
//        case 1:
//          shoeList[1] = null;
//          break;
//        case 2:
//          shoeList[2] = null;
//          break;
//        case 3:
//          shoeList[3] = null;
//          break;
//        case 4:
//          shoeList[4] = null;
//          break;
//
//      }
//
//    }
//  }
//
//  public void update()
//  {
//    Product shoe;
//    int id;
//
//    if (input.hasNextInt())
//    {
//      id = input.nextInt();
//      shoe = shoeList[id];
//
//      shoe.setName("Adidas");
//      shoeList[id].setSize(35.0);
//      System.out.println(shoeList[id]);
//
//    }
//    else
//    {
//      System.out.println("Enter a valid id.");
//    }
//
//  }
    public void create(Integer id, String name, double size, String type) {

        Product shoe = new Shoe(id, name, size, type);
//        shoeList[0] = nike;
        shoeList[id] = shoe;

    }

    public Product find(Integer id) {
        for (Product product : shoeList) {
            if (product.getId() == id) {

                return product;

            }

        }
        return null;

    }

    public Product find(String name) {
        for (Product product : shoeList) {
            if (product.getName() == name) {

                return product;

            }

        }
        return null;

    }

    public Product delete(Integer id) {

        for (Product product : shoeList) {

            if (product.getId() == id) {
//                Product shoe=shoeList[id];
//
//                return shoe = null;
                return shoeList[id] = null;

            }

        }
        return null;
    }

    public Product update(Integer id, String name, double size, String type) {
        for (Product product : shoeList) {
            if (product.getId() == id) {

                product.setName(name);
                product.setSize(size);
                product.setType(type);
                return shoeList[id];

            }

        }
        return null;

    }

    public void showShoeList() {
        for (Product product : shoeList) {
            System.out.println(product);
        }
    }
}
