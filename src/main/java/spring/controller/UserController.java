package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.model.User;
import spring.service.UserService;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    //POST(to save something) GET(to retrieve something) DELETE(to delete) PUT(to update)


    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public Collection<User> users() {
        return userService.findAll();
    }

    @GetMapping("/get/{id}") //localhost:8080/user/get/25251514234
    public ResponseEntity getUser(@PathVariable("id") String id) {
        Optional<User> user = userService.findById(UUID.fromString(id));
        return user.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
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
    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id) {
        userService.deleteById(UUID.fromString(id));
        return ResponseEntity.ok().build();
    }

}
