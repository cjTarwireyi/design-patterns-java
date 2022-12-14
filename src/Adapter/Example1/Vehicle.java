package Adapter.Example1;

public abstract class Vehicle {
    String brand;

    public  Vehicle(String brand){
        this.brand = brand;
    }
    abstract int getSpeed();

    @Override
    public String toString(){
        return brand + " : " + getSpeed() + " MPH";
    }
}
