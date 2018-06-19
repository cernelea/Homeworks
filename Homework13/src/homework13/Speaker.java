package homework13;

public class Speaker {

    String type, brand;
    int price;
    final double size, weight;

    Speaker(String brand, String type, int price, double size, double weight) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.size = size;
        this.weight = weight;

    }

    public void playMusic() {
        System.out.println("Every speaker can play music");
    }

    public final void bluetoothPlaying() {
        System.out.println("In 2018 a lot of speakers have bluetooth playing");

    }
     
    sout

    
    public String toString() {
        return getClass().getName() + " The type of speaker is: " + type + ". The brand is: " + brand + ". The price is:  " + price + ". The size is:   " + size + ". The weight is:" + weight;
    }

}
