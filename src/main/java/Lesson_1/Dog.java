package Lesson_1;

//Formatierung: Strg+Alt+L
public class Dog {
    public String colorOfTheSkin;
    public int weight;
    public int maxSpeed;
    public int age;
    public int height;
    public String gender;
    public String race;
    public String name;

    /**
     * This a constructor that sets up all the fields
     */
    public Dog(String color, int weight, int maxSpeed, int age, int height, String gender, String race,String name) {
        this.colorOfTheSkin = color;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.race = race;
        this.name = name;
    }

    /**
     * This is a default constructor (Dobermann)
     */
    public Dog() {
        this.colorOfTheSkin = "Black";
        this.weight = 40;
        this.maxSpeed = 56;
        this.age = 6;
        this.height = 68;
        this.gender = "Male";
        this.race = "Dobermann";
        this.name = "Dog Doe";
    }

    /**
     * This method calculate the dog age into human age
     */
    public int getHumanAge() {
        return this.age * 7;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String dogName) {
        this.name = dogName;
    }
}
