package Homework14;

public class Player {

    final String name;
    String equipement, game;
    int age;

    public Player(String name) {
        this.name = name;

    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Player(String name, String game, String equipement, int age) {
        this.name = name;
        this.game = game;
        this.equipement = equipement;
        this.age = age;

    }

    public void play(String game, String equipement) {

    }

    public void retirement() {

    }

    public String toString() {

        return getClass().getName() + " Every player is playing some kind of a: " + game + ". Each of this players must have a: " + equipement;

    }

}
