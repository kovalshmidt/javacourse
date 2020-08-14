package spring.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;


@Getter
@Setter
@Entity
@Table(name = "product")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Product {

    @Id
    @GeneratedValue
    private UUID uuid;
    private String name;
    private String description;
    private int available;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

}
