package Homework14;


public class MainMethod {

    public static void main(String[] args) {
 
   Player johnyWilkinson=new RugbyPlayer("Johny Wilkinson",25,"Fly half",3,20000);
   johnyWilkinson.play("rugby","Rugby shirt, boots, socks and rugby ball" );
   johnyWilkinson.retirement();
   System.out.println(johnyWilkinson);
        System.out.println("");
   Player patrikAntonius=new PokerPlayer("Patrik Antonius",35,60);
   patrikAntonius.play("Poker","poker cards and money in his poket. " );
    patrikAntonius.retirement();
        System.out.println(patrikAntonius);
    
    }

}    
    
    
    
    
    

