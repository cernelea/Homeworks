package homework13;

public class Loudspeaker extends Speaker {

    final String levelOfNoise;

    Loudspeaker(String brand, String type, int price, double size, double weight, String levelOfNoise) {
        super(brand, type, price, size, weight);
        this.levelOfNoise = levelOfNoise;

    }
    
   

    public void playMusic() {

        System.out.println(brand + " " + type + " play's music very loud");

    }

    @Override
    public String toString() {
       
        return super.toString() + " Level of noise: " + levelOfNoise;
    }

}
