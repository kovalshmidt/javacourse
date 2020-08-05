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
@Table(name = "products")
public class Products {

    @Id
    private UUID uuid;
    private String name;
    private String description;
    private int available;

    public Products(){this.uuid = UUID.randomUUID();}
    public Products(String name, String description, int available){
        this();
        this.name = name;
        this.description = description;
        this.available = available;
    }
}
