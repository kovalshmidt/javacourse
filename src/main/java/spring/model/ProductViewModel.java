package spring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductViewModel {

    private String uuid;
    private String name;
    private String description;
    private int available;
    private String userId;
}
