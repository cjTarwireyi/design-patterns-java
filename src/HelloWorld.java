public class HelloWorld {

    public static void main(String[] args) {
     Car renault = new  Car (1000,"White");
     Car merc = new  Car (1200,"Blue");
     System.out.println(renault.color);
     System.out.println(merc.color);
     renault.drive();
     renault.brake();
    }
}
