package spring.Abstraction;

public class Penguin extends  Bird{


    @Override
    public void sound() {
        System.out.println("Squaking");
    }

    @Override
    public void move(){
        System.out.println("Swim");
    }
}
