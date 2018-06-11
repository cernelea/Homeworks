package homework.pkg10;

class DefaultClass {

    final int i = 5;
    int sq;
    final double h = 25.0;
    double sqrt;



    DefaultClass() {

        System.out.println("The final variable of i is " + i);

    }

    void square(int i) {

        sq = i * i;

        System.out.println("Square of " + i + " is " + sq);

    }

    void squareRoot(double h) {

        sqrt = Math.sqrt(h);

        System.out.println("Square root of " + h + " is " + sqrt);

    }
    
        static {
        System.out.println("Default Class  static block");

    }

    {

        System.out.println("Default Class non static block");

    }
    
    

}
