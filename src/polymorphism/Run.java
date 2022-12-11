package polymorphism;

public class Run {
    public static void main(String[] args) {
       Animal dog = new Dog();
       Animal cat = new Cat();
       dog.animalSound();
       cat.animalSound();
    }
}
