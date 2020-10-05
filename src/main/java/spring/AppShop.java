package spring;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AppShop {

    public static void main(String[] args) {
        SpringApplication.run(AppShop.class, args);
    }
}
