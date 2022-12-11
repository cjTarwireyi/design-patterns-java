package interfaces;

public class Cat implements Animal {

    @Override
    public void animalSound() {
        System.out.println("Meow");
    }

    @Override
    public void animalSleep() {
        System.out.println("zzzz");
    }
}
