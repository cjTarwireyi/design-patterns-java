package Adapter.Example1;

public abstract class VehicleAdapter extends Vehicle implements  AdapterService {

    public VehicleAdapter(String brand) {
        super(brand);
    }
    int getSpeed(){
        return speedKMH();
    }
    @Override
    public String toString(){
        return brand + " : " + getSpeed() + " KMPH";
    }
}
