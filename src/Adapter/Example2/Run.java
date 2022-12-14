package Adapter.Example2;

public class Run {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        //s1.draw();

        GeoMetricShape gs1 = new Rhombus(2,3);
        //gs1.drawShape();

        //Drawing using an adapter
        //Approach 1: one adapter for all shapes
       Shape s2 = new GeometricShapeObjectAdapter(new Triangle(1,2,3));
        s2.draw();

        //Approach 2: each shape has its own adapter
        Shape s3 = new TriangleAdapter(1,2,3);
        s3.draw();;

    }
}
