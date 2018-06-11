
package homework.pkg10;


 public class PublicClass {
     
   public final int a=5,b=8;
   public double c;
   
   PublicClass(){
   System.out.println("The value of a and b is: " +a+" , " +b);
   
   
   }
   
  public void pythagora(double a, double b){
   c=Math.sqrt(a*a+b*b);
   
   System.out.println("Hypotenuse is equal to : " +c);
   
   
  }
   
    
    
      static {
        System.out.println("Public Class  static block");

    }

    {

        System.out.println("Public Class non static block");

    }
    
    
    
    
    
    
}
