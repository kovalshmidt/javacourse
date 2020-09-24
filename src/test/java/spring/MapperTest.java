package spring;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.model.Product;
import spring.model.ProductViewModel;
import spring.model.User;
import spring.model.UserViewModel;
import spring.repository.ProductRepository;
import spring.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MapperTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Mapper mapper;
    @Autowired
    private ProductRepository productRepository;
    private static SoftAssertions softAssertions;

    @BeforeAll
    public static void setUp() {
        softAssertions = new SoftAssertions();
    }

    @Test
    public void testConvertProductToViewModel(){
        //Create a user object, populate with date and persist in database
        User userTest = new User();
            userTest.setName("John");
            userTest.setSurname("Doe");
            userTest.setAge(21);
            userTest.setEmail("joe@doe.com");
        userRepository.save(userTest);
        //Create a product Object, populate with data and persist in database
        Product productTest = new Product();
        productTest.setName("Good Stuff");
        productTest.setUser(userTest);
        productTest.setDescription("Only the best for the customer");
        productTest.setAvailable(42);
        productRepository.save(productTest);
        //Convert Product to Product View Model
        ProductViewModel viewModelTest = mapper.convertProductToViewModel(productTest);
        //Test: Fields productTest =? Fields viewModelTest
        softAssertions.assertThat(productTest.getName()).isEqualTo(viewModelTest.getName());
        softAssertions.assertThat(productTest.getAvailable()).isEqualTo(viewModelTest.getAvailable());
        softAssertions.assertThat(productTest.getDescription()).isEqualTo(viewModelTest.getDescription());
        softAssertions.assertThat(productTest.getUser().getUuid().toString()).isEqualTo(viewModelTest.getUserId());
        softAssertions.assertThat(productTest.getUuid().toString()).isEqualTo(viewModelTest.getUuid());
    }
    @Test
    public void testViewModelToProduct(){
        User userTest = new User();
        userTest.setName("John");
        userTest.setSurname("Doe");
        userTest.setAge(21);
        userTest.setEmail("joe@doe.com");
        userRepository.save(userTest);

        ProductViewModel productViewModel = new ProductViewModel();
        productViewModel.setName("Good Stuff");
        productViewModel.setUserId(userTest.getUuid().toString());
        productViewModel.setDescription("Only the best for the customer");
        productViewModel.setAvailable(42);
        productViewModel.setUuid(UUID.randomUUID().toString());

        Product product = mapper.viewModelToProduct(productViewModel);
        softAssertions.assertThat(product.getName()).isEqualTo(productViewModel.getName());
        softAssertions.assertThat(product.getAvailable()).isEqualTo(productViewModel.getAvailable());
        softAssertions.assertThat(product.getDescription()).isEqualTo(productViewModel.getDescription());
        softAssertions.assertThat(product.getUser().getUuid().toString()).isEqualTo(productViewModel.getUserId());
        softAssertions.assertThat(product.getUuid().toString()).isEqualTo(productViewModel.getUuid());
    }

    @Test
    public void testUserToViewModel(){
        Product productTest = new Product();
        productTest.setName("Good Stuff");
        productTest.setDescription("Only the best for the customer");
        productTest.setAvailable(42);
        productRepository.save(productTest);

        User userTest = new User();
        userTest.setName("John");
        userTest.setSurname("Doe");
        userTest.setAge(21);
        userTest.setEmail("joe@doe.com");
        List<Product> products = new ArrayList<>();
        products.add(productTest);
        userTest.setProducts(products);
        userRepository.save(userTest);


        UserViewModel userViewModel = mapper.convertUserToViewModel(userTest);
        softAssertions.assertThat(userTest.getName()).isEqualTo(userViewModel.getName());
        softAssertions.assertThat(userTest.getSurname()).isEqualTo(userViewModel.getSurname());
        softAssertions.assertThat(userTest.getAge()).isEqualTo(userViewModel.getAge());
        softAssertions.assertThat(userTest.getEmail()).isEqualTo(userViewModel.getEmail());
        softAssertions.assertThat(userTest.getUuid().toString()).isEqualTo(userViewModel.getUuid());
        softAssertions.assertThat(userTest.getProducts()).isEqualTo(userViewModel.getProducts());

    }
    @Test
    public void testViewModelToUser(){
        ProductViewModel productTest = new ProductViewModel();
        productTest.setName("Good Stuff");
        productTest.setDescription("Only the best for the customer");
        productTest.setAvailable(42);

        UserViewModel userViewModelTest = new UserViewModel();
        userViewModelTest.setName("John");
        userViewModelTest.setSurname("Doe");
        userViewModelTest.setAge(21);
        userViewModelTest.setEmail("joe@doe.com");
        List<ProductViewModel> products = new ArrayList<>();
        products.add(productTest);
        userViewModelTest.setProducts(products);


        User user = mapper.convertUserViewModelToUser(userViewModelTest);
        softAssertions.assertThat(userViewModelTest.getName()).isEqualTo(user.getName());
        softAssertions.assertThat(userViewModelTest.getSurname()).isEqualTo(user.getSurname());
        softAssertions.assertThat(userViewModelTest.getAge()).isEqualTo(user.getAge());
        softAssertions.assertThat(userViewModelTest.getEmail()).isEqualTo(user.getEmail());
        softAssertions.assertThat(userViewModelTest.getUuid()).isEqualTo(user.getUuid().toString());
        softAssertions.assertThat(userViewModelTest.getProducts()).isEqualTo(user.getProducts());

    }

    @AfterAll
    public static void end() {
        softAssertions.assertAll();
    }
}