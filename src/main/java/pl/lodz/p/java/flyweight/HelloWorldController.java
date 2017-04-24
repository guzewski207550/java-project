package pl.lodz.p.java.flyweight;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWordl() {
        return "Hello World!";
    }
}
