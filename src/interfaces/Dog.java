package interfaces;

public class Dog implements Animal  {

    @Override
    public void animalSound() {
        System.out.println("hoof");
    }

    @Override
    public void animalSleep() {
        System.out.println("zzzz");
    }
}
