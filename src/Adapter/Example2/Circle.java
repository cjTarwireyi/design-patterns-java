package Adapter.Example2;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void resize() {
        System.out.println("Re-sizing Circle");
    }

    @Override
    public String description() {
        return "Circle Object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
