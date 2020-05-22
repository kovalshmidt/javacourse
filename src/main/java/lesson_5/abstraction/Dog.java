package lesson_5.abstraction;

import lombok.Getter;

public abstract class Dog implements Animal{

    public static final int NUMBER_OF_LEGS = 4;
    @Getter
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String move() {
        return "the dog runs on " + NUMBER_OF_LEGS;
    }
}
