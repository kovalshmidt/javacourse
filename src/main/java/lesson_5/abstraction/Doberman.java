package lesson_5.abstraction;

public class Doberman extends Dog{

    public Doberman(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "bark";
    }
}
