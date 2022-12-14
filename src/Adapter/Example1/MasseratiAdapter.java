package Adapter.Example1;

public class MasseratiAdapter extends VehicleAdapter {
    public MasseratiAdapter() {
        super("Masserati");
    }

    @Override
    public int speedKMH() {
        return (int) (200 * 1.6);
    }
}
