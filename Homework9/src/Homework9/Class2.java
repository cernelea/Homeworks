package Homework9;

public class Class2 {

    // 1.To create 2 classes first with main method second with any variables
    static int numarLaturi;// 2,3,4.To create a static variable
    double lungime, latime;
    double aria;

    Class2(int numarLaturi, int lungime, int latime) {//5.Constructor with static variable and incrementing this variable and printing in console.
        this.lungime = lungime;
        this.latime = latime;
        numarLaturi = ++numarLaturi;
        System.out.println("Static:" + numarLaturi);

    }

    Class2(int numarLaturi, double lungime, double latime, double aria) {//6. In this case I made overloaded constructors 
        this.lungime = lungime;                                                // I placed it's value and changed in some way.
        this.latime = latime;
        this.aria = aria;
        latime = aria / lungime;
        numarLaturi = ++numarLaturi;
        System.out.println("Static:" + numarLaturi);
        System.out.println("Non-Static:" + latime);

    }

    Class2() {

    }
}
