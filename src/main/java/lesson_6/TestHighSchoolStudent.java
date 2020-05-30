package lesson_6;

public class TestHighSchoolStudent {

    public static void main(String[] args) {

        HighSchoolStudent student1 = new HighSchoolStudent();
        student1.setAge(20);
        student1.setName("Martin");
        student1.setSurname("Nebeling");

        HighSchoolStudent student2 = new HighSchoolStudent();
        student2.setAge(22);
        student2.setName("Martin");
        student2.setSurname("Nebeling");

//        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.toString());
        System.out.println(student1.getClass());
    }
}
