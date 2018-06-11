package homework.pkg10;

class ProtectedClass {

    protected int a, b, answer; // a is length and b is width

    protected void area(int a, int b) {
        answer = a * b;

        System.out.println("The area is: " + answer);

    }

      static {
        System.out.println("Protected Class  static block");

    }

    {

        System.out.println("Protected Class non static block");

    }
    
}
