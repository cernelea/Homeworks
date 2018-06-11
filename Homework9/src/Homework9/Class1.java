package Homework9;

public class Class1 {

    public static void main(String[] args) {
        int i;

        Class2.numarLaturi = 4;
        Class2 Dreptunghi = new Class2(3, 5, 6, 5);
        i = 0;

        System.out.println();
        for (i = 0; i <= 10; i++) {   // 7. To create an example with "for" to print every loop with a text and each loop must create a new object.

            System.out.println("Iteratia numarul " + i);
            Class2 patrat = new Class2();

        }

    }

}
