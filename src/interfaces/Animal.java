package interfaces;
//Interface can not contain implementation
//interface is just a contract which can be implemented by subclasses
// subclasses can implements multiple inmterfaces
public interface  Animal {
    //Abstraction that groups related methods that only has empty bodies
    public abstract void animalSound();
    public void animalSleep();
}
