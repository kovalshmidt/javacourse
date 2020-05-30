package lesson_6;

import lombok.Data;

import java.util.Objects;

@Data
public class HighSchoolStudent {

    private String name;
    private String surname;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HighSchoolStudent that = (HighSchoolStudent) o;
        return name.equals(that.name) &&
                surname.equals(that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

}
