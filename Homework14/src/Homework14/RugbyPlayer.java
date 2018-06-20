package Homework14;

public class RugbyPlayer extends Player {

    final String position;
    int tries, bonus, salary;

    public RugbyPlayer(String name,String game, String equipement, int age, String position, int tries) {
        super(name, game, equipement, age);
        this.position = position;
        this.tries = tries;
    }

    public RugbyPlayer(String name,int age,String position, int tries, int salary) {
       super(name,age);
        this.position = position;
        this.tries = tries;
        this.bonus = bonus;
        this.salary = salary;
    }

    public final void play(String game, String equipement) {
        System.out.println("This player name is: "+name+". He is: "+age+" years old"+". This guy is playing : " + game + ". His position is " + position + ". He must have: " + equipement);
        if (tries <= 5) {

            switch (tries) {
                case 0:
                    salary = salary;
                    System.out.println("Our player didn't score any tries. He didn't receive any bonus so his salary remains the same: " + salary);
                    break;
                case 1:
                    bonus = 10 * salary / 100;
                    salary = bonus + salary;
                    System.out.println("For scorying one try our rugby player will receive 10% bonus from his salary:" + bonus + "$ and his salary will be equivalent to: " + salary + "$.");
                    break;
                case 2:
                    bonus = 11 * salary / 100;
                    salary = bonus + salary;
                    System.out.println("For scorying two tries our rugby player will receive 11% bonus from his salary:" + bonus + "$ and his salary will be equivalent to: " + salary + "$.");
                    break;
                case 3:
                    bonus = 12 * salary / 100;
                    salary = bonus + salary;
                    System.out.println("For scorying three tries our rugby player will receive 12% bonus from his salary:" + bonus + "$ and his salary will be equivalent to: " + salary + "$.");
                    break;
                case 4:
                    bonus = 13 * salary / 100;
                    salary = bonus + salary;
                    System.out.println("For scorying four tries our rugby player will receive 13% bonus from his salary:" + bonus + "$ and his salary will be equivalent to: " + salary + "$.");
                    break;
                case 5:
                    bonus = 14 * salary / 100;
                    salary = bonus + salary;
                    System.out.println("For scorying five tries our rugby player will receive 14% bonus from his salary:" + bonus + "$ and his salary will be equivalent to: " + salary + "$.");
                    break;
                default:
                    break;

            }

        } else {
            bonus = 20 * salary / 100;
        
        salary = bonus + salary;
        System.out.println("For scorying more than a five tries our rugby player will receive 20% bonus from his salary which are: " + bonus + "$ and his salary will be equivalent to: " + salary + "$.");
        }
    }
     public void retirement(){
         if(age>33) {
             System.out.println(name+" will retire soon because of his age");}
         
                 else
             System.out.println(name+" is still fit to play");
             
   
   
   
   }

    public String toString() {
       

        return getClass().getName()+" This player name is: "+name+". He is: "+age+" years old"+ ". His position is " + position + ". He receives:"+salary+" $.";
    }

}
