package spring.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserViewModel {

    private String uuid;
    private String name;
    private String surname;
    private String email;
    private int age;
    private List<ProductViewModel> products;
}
