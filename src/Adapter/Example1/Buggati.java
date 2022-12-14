package Adapter.Example1;

public class Buggati extends Vehicle {
    public Buggati(String brand) {
        super("Buggati");
    }

    @Override
    int getSpeed() {
        return 240;
    }
}
