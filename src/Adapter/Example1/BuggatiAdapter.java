package Adapter.Example1;

public class BuggatiAdapter extends VehicleAdapter {
    public BuggatiAdapter() {
        super("Buggati");
    }

    @Override
    public int speedKMH() {
        return (int)(240 * 1.6);
    }
}
