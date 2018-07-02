//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.tekwill.services;

import com.tekwill.model.Product;

/**
 *
 * @author sscerbatiuc
 */
public interface Modifiable {

    Product find(Integer id);
     Product find(String name);

    Product delete(Integer id);

    // void create();
    void create(Integer id, String name, double size, String type);

    Product update(Integer id, String name, double size, String type);

    void showShoeList();

}
