package Adapter.Example1;

public class Masserati extends Vehicle {
    public  Masserati(){
        super("Masserati");
    }
    @Override
    int getSpeed() {
        return 200;
    }
}
