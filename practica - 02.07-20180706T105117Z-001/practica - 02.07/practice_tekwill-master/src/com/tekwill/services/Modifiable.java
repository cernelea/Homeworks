//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.tekwill.services;

import com.tekwill.model.Product;

/**
 *
 * @author sscerbatiuc
 */
public interface Modifiable
{

  Product find(Integer id);

  Product find(String name);

  void delete(Integer id);

  // void create();
  void create(Integer id, String name, double size, String type);

  Product update(Integer id,int newId ,String name, double size, String type);

  void showShoeList();

}
