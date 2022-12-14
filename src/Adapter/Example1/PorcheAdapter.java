package Adapter.Example1;

public class PorcheAdapter extends VehicleAdapter {
    public PorcheAdapter(String brand) {
        super("Porche");
    }

    @Override
    public int speedKMH() {
        return (int) (220 * 1.6);
    }
}
