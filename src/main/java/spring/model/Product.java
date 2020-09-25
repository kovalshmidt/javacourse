package spring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;


@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private UUID uuid;
    private String name;
    private String description;
    private int available;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

}
