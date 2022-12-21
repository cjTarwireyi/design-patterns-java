package Proxy;

import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;

public class Run {
    public static void main(String[] args) {
        Image img = new RealImage("MyImage.png");
        img.display();
        img.display();
        img.display();
        img.display();
    }
}
