package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.model.Product;
import spring.model.User;
import spring.service.ProductService;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {


    //POST(to save something) GET(to retrieve something) DELETE(to delete) PUT(to update)


    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public Collection<Product> products() {
        return productService.findAll();
    }

    @GetMapping("/get/{id}") //localhost:8080/product/get/25251514234
    public ResponseEntity getProduct(@PathVariable("id") String id) {
        Optional<Product> products = productService.findById(UUID.fromString(id));
        return products.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    //it expects a uri of POST method with path /product/save (Post means that you have to pass an object)
    public ResponseEntity<Product> productSave(@Valid @RequestBody Product product) throws URISyntaxException { //receive the object passed with POST method, validate it
        //save the passed object into the database by using ProductService and then, save the saved object in a variable called result
        Product result = productService.save(product);
        //return a ResponseEntity with saved Product (saved it means that an id was assigned to it in the process of saving)
        return ResponseEntity.ok(result);
    }

    //    @PostMapping("/save")
//    public ResponseEntity<User> user(@Valid @RequestBody User user) throws URISyntaxException {
//        User result = userService.save(user);
//        return ResponseEntity.created(new URI("/api/user/" + result.getId())).body(result);
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity<User> updateUser(@Valid @RequestBody User user) {
//        User result = userService.save(user);
//        return ResponseEntity.ok().body(result);
//    }
//
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id) {
        productService.deleteById(UUID.fromString(id));
        return ResponseEntity.ok().build();
    }

}
