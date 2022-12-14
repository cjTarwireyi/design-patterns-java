package Adapter.Example1;

public class Porche extends Vehicle {
    public Porche(String brand) {
        super("Porche");
    }

    @Override
    int getSpeed() {
        return 200;
    }
}
