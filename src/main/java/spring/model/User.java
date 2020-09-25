package spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private UUID uuid;
    private String name;
    private String surname;
    private String email;
    private int age;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    //    The Jackson annotation @JsonIgnore is used to tell Jackson to ignore a certain property (field) of a Java object.
    //    The property is ignored both when reading JSON into Java objects, and when writing Java objects into JSON.
    private List<Product> products;

    public User(){
        this.products = new ArrayList<>();
    }
}
