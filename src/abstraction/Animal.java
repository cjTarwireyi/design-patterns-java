package abstraction;
//A class that can not be instantiated
//subclasses overrides or implement its methods
//subclasses can not implement multiple abstract classes
public abstract class Animal {
    //Different behaviors goes into abstract methods which does not contain implementation in the base class
    // Implementation will only be in the subclasses
    //Such as in this case animals make different sounds
    public abstract void animalSound();
    //Non-abstract classes will contain common behaviors such as in this case Sleep
    public void animalSleep(){
        System.out.println("zzzz");
    }
}
