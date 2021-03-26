package spring.Abstraction;

//Abstract classes have at least one abstract method
public abstract class Bird implements Animal{

    public abstract void sound();

    public void move() {
        System.out.println("Fly");
    }
}
