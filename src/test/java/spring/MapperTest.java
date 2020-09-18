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
import spring.repository.ProductRepository;
import spring.repository.UserRepository;

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

    @AfterAll
    public static void end() {
        softAssertions.assertAll();
    }
}