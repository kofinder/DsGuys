package design_patterns.adaptor;

interface Bird {
    void fly();

    void yell();
}

class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void yell() {
        System.out.println("Chirp Chirp");
    }

}

interface ToyDuck {
    public void squeak();
}

class PlasticToyDuck implements ToyDuck {
    public void squeak() {
        System.out.println("Squeak");
    }
}

class BirdToToyDuckAdapter implements ToyDuck {

    Bird bird;

    public BirdToToyDuckAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.yell();
    }
}

public class AnimalAdoptionDemo {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        ToyDuck birdAdapter = new BirdToToyDuckAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.yell();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        System.out.println("BirdAdapter...");
        birdAdapter.squeak();

    }
}
