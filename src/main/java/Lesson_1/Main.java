package Lesson_1;

public class Main {
    public static void main(String[] args) {
        Dog dobermann = new Dog();
        Dog germanShepard = new Dog("Brown", 30, 50, 8, 60, "Female", "German Shepard","Josie");
        //System.out.println("This dog's name is, "+dobermann.getName());
        dobermann.setName("Boris");
       // System.out.println("This dog's name is, "+dobermann.getName());
       int shepardAge = germanShepard.getHumanAge();
        System.out.println("The dog's age in human years would be: "+shepardAge);
        int dobermannAge = dobermann.getHumanAge();
        System.out.println("The dog's age in human years would be: "+dobermannAge);
    }

}
