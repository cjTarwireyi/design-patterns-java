public class Car {
    //Attributes
    float weight = 1200;
    String color = "white";

    //constructor => used to create the object
    public Car(float weight, String color){
        this.weight = weight;
        this.color = color;
    }
    //Methods
    public void drive (){
        System.out.println("Driving....");
    }

    public void brake(){
        System.out.println("Stopping....");
    }

}
