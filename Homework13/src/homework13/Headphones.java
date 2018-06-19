package homework13;

public class Headphones extends Speaker {

  final String noiseCanceling;

    Headphones(String brand, String type, int price, double size, double weight, String noiseCanceling) {
        super(brand, type, price, size, weight);
        this.noiseCanceling = noiseCanceling;

    }

    public String noise(String noiseCanceling) {

        return noiseCanceling + "ceva";

    }

    public void playMusic() {
        System.out.println(brand + " " + type + " is playing music not so loud like loudspeakers because it has " + this.noise(noiseCanceling));

    }

    @Override
    public String toString() {
        return super.toString() + " This headphones got: " + noiseCanceling;
    }

}
