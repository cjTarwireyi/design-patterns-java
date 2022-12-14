package Adapter.Example1;

public class Run {
    public static void main(String[] args) {
        Vehicle v1 = new Masserati();
        Vehicle v2 = new MasseratiAdapter();
        System.out.println(v1);
        System.out.println(v2);

    }
}
