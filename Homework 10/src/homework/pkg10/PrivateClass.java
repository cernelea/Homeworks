package homework.pkg10;

class PrivateClass {

   private  int b = 0, n = 0;
     private char letter = 'a';

    private void alphabetCounting() {

        for (b = 65; b <= 90; ++b) {
            letter = (char) b;
            n = ++n;
            System.out.println("The letter number :" + n + " of the alphabet is: " + letter);

        }

    
    }

  static {
        System.out.println("Private Class  static block");

    }

    {

        System.out.println("Private Class non static block");

    }



}


