public class HelloWorld {

    public static void main(String[] args) {
     Car renault = new  Car (1000,"White");
     Car merc = new  Car (1200,"Blue");
     System.out.println("Renault without load weighs " + renault.getWeight());
     renault.setWeight(3000);
     System.out.println("Renault with load weighs " + renault.getWeight());
     System.out.println(merc.getColor());
     renault.drive();
     renault.brake();
    }
}
