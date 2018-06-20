package Homework14;

public class PokerPlayer extends Player {

    final int risk;

    public PokerPlayer(String name, int age, int risk) {
        super(name, age);
        this.risk = risk;
    }

    public void play(String game, String equipement) {

        System.out.println("The player name is: " + name +". He is: "+age+" years old" +". This guy is playing: " + game + ". He must have: " + equipement);

        if (risk > 50) {

            System.out.println("In terms of his risk, this player is bluffing a lot. ");
        } else {
            System.out.println("In terms of his risk, this player is not so agrressive and is plaiyng a value bet");
        }

    }

    public void retirement() {
        System.out.println("In this kind of game it doesn't matter how old you are, you will never retire");

    }
    
    
    public String toString(){
    
    
    
    return getClass().getName()+" The player name is: " + name +". He is: "+age+" years old. His risk is equal to: " +risk+" %";
    }

}
