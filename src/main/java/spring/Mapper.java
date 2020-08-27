package spring;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.model.Product;
import spring.model.ProductViewModel;
import spring.model.User;
import spring.model.UserViewModel;
import spring.service.UserService;

import javax.validation.constraints.Null;
import java.util.Optional;
import java.util.UUID;

@Component
public class Mapper {


    private UserService userService;

    @Autowired
    public Mapper(UserService userService) {
        this.userService = userService;
    }

    /**
     * Convert Product entity to ProductViewModel that represent Product fields in a way that allows the use of it JSON
     */
    public ProductViewModel convertProductToViewModel(Product product) {
        ProductViewModel productViewModel = new ProductViewModel();
        //Set fields
        productViewModel.setUuid(product.getUuid().toString());
        productViewModel.setDescription(product.getDescription());
        productViewModel.setName(product.getName());
        productViewModel.setAvailable(product.getAvailable());
        productViewModel.setUserId(product.getUser().getUuid().toString());

        return productViewModel;
    }

    public Product viewModelToProduct(ProductViewModel productViewModel){
        //Variable declaration: Type variableName = value;
        Product product = new Product();

        //transform uuid of type String in ProductViewModel to uuid of type UUID and set it in poruduct as uuid
        String uuidVM = productViewModel.getUuid();
        UUID uuid = UUID.fromString(uuidVM);
        product.setUuid(uuid);

        //Set the description
        product.setDescription(productViewModel.getDescription());

        //Set Name
        product.setName(productViewModel.getName());

        //Set available Products
        product.setAvailable(productViewModel.getAvailable());

         //retrieved user id of type UUID
         userService
                 .findById(UUID.fromString(productViewModel.getUserId()))
                 .ifPresent(product::setUser);

        return product;
    }

    //A method that transforms UserViewModel into User entity
    public User 

    //A method that transforms User entity into UserViewModel
}
