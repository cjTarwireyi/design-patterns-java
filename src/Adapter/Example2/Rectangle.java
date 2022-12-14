package Adapter.Example2;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Re-sizing Rectangle");
    }

    @Override
    public String description() {
        return "Rectangle Object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
