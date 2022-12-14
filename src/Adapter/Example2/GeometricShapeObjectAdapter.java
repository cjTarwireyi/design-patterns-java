package Adapter.Example2;

public class GeometricShapeObjectAdapter implements Shape{
    private GeoMetricShape adaptee;
    public GeometricShapeObjectAdapter(GeoMetricShape adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + "Cannot be resized now  !!");
    }

    @Override
    public String description() {
       if(adaptee instanceof  Triangle){
           return "Triangle object";
       }
       else if(adaptee instanceof  Rhombus){
           return "Rhombus Object";
       }
       else{
           return "Unknown object";
       }
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
