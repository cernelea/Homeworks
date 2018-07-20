package com.tekwill.figuresTemplate;

public class Rectangles extends Figures implements CalculationsRectangles {

    double length, width;

    public Rectangles(int id, String name) {
        super(id, name);

    }

    public void calcArea(double length, double width) {
        double area = length * width;

    }

    public void calcPerim(double length, double width) {
        double perim = 2 * length + 2 * width;

    }
    
    public String toString(){
    
    
    
    
    return this.id+" "+this.name;
    }
    
    

}
