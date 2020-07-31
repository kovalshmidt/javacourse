package spring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    private UUID uuid;
    private String name;
    private String surname;
    private String email;
    private int age;

    // User user = new User();
    public User() {
        this.uuid = UUID.randomUUID();
    }

    //User user = new User("bob", "fisher", "bob@bob.com", 28);
    public User(String name, String surname, String email, int age) {
        this();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }
}
