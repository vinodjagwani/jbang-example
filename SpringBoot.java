//DEPS org.springframework.boot:spring-boot-starter-web:4.0.1
//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2

package demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringBoot {

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot + JBang + Java 25!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }
}