public class Car {
    //Attributes
    private float weight;
    private String color;

    //Getters & Setters
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }

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
