package com.tekwill.project1;

public class Figure1 {

//Number 1,2,and 3 to create 2 classes, first with 5 variables int string char boolean and 1 variable type of the second class
    int length;
    int width;
    String name;
    char shortName;
    boolean answer;
    Figure2 n;

    // Number 4,  5 overloaded constructors and to use "this" keyword 
    Figure1(int length, int width, String name, char shortName) {
        this.length = length;
        this.width = width;
        this.name = name;
        this.shortName = shortName;

    }

    Figure1() {

    }

    Figure1(int length, int width) {
        this.length = length;
        this.width = width;

    }

    Figure1(boolean answer, String name) {
        this();
        this.answer = answer;
        this.name = name;

    }

    Figure1(int length, int width, String name) {
        this(length, width);
        this.name = name;

    }
// To create methods whih different conditions

    public void nothing() {

    }

    public int method2(int number) {
        return number;

    }

    Figure1 method3() {

        return this;

    }
    
    
    // Method 3 how to make to return the class type?

    public void method4(Figure1 parameter) {
System.out.println(parameter);
    }

    public void method5() {
        this.nothing();

    }

    public void method6() {
        this.method2(5);  // in this case I didn't succeed with leeaving blanc this scopes or putting "number" variable from Method2, I guess because it wasn't declared. 

    }

    public void method7() {
        method4(this);

    }
}
