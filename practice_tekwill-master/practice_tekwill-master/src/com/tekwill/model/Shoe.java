//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.tekwill.model;

/**
 *
 * @author sscerbatiuc
 */
public class Shoe extends Product {

    private double size;
    private String type;

    /**
     *
     * @return
     */
    public Shoe(int id, String name, double size) {
        super(id, name);
        this.size = size;

    }

    /**
     *
     * @param id
     * @param name
     * @param size
     * @param type
     */
    public Shoe(int id, String name, double size, String type) {
        super(id, name);
        this.size = size;
        this.type = type;

    }

    public double getSize() {
        return this.size;

    }

    /**
     *
     * @param size
     */
    public void setSize(double size) {
        this.size = size;

    }

    /**
     *
     * @return
     */
    public String getType() {
        return this.type;

    }

    /**
     *
     * @param type
     */
    public void setType(String type) {

        this.type = type;
    }

    @Override
    public String toString() {

        return this.id + " " + this.name + " " + this.size + " " + this.type + " ";
    }

}
