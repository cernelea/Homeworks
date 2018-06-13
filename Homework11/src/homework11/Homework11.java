package homework11;

public class Homework11 {

    public static void main(String[] args) {

        String nume[] = {"POPESCU", "iONESCU", "BASESCU", "DUMITRESCU"};

        String message = new String("Hello World");
        double array[][] = new double[12][2];

        for (int i = 0; i <= nume.length - 1; i++) {
            nume[i] = nume[i].toLowerCase();
            System.out.println(nume[i]);

        }
        System.out.println();
        System.out.println("The first message is: " + message);

        message = "Hello John";
        System.out.println("The second message is: " + message);

        System.out.println();

        array[0][0] = 1;
        array[1][0] = 2;
        array[2][0] = 3;
        array[3][0] = 4;
        array[4][0] = 5;
        array[5][0] = 6;
        array[6][0] = 7;
        array[7][0] = 8;
        array[8][0] = 9;
        array[9][0] = 10;
        array[10][0] = 11;
        array[11][0] = 12;

        array[0][1] = 20.5;
        array[1][1] = 20.4;
        array[2][1] = 20.0;
        array[3][1] = 19.8;
        array[4][1] = 19.9;
        array[5][1] = 20.1;
        array[6][1] = 20.2;
        array[7][1] = 20.4;
        array[8][1] = 19.7;
        array[9][1] = 19.8;
        array[10][1] = 19.9;
        array[11][1] = 20.0;

        System.out.println("For each month of the year coresponds the number of the month : ");
        
        
        for(int i=0; i<array.length;i++){
         
            System.out.println("Month  "+array[i][0]+"    "+array[i][1]+"   lei" );
            
        
        
        
        
        }
    
    
    
    
    }
    
    

}
