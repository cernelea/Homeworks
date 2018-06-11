package homework.pkg10;

public class MaincClass {

    public static void main(String[] args) {

        DefaultClass object1 = new DefaultClass();
        object1.squareRoot(2500);
        System.out.println();

        PrivateClass object2 = new PrivateClass();

        System.out.println();
        
        ProtectedClass object3=new ProtectedClass();
        object3.area(5, 2);

        System.out.println();
        
        PublicClass object4=new PublicClass();
        object4.pythagora(5.0, 15.0);
        
        
    }

}
