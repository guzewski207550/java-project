package pl.lodz.java.budget.planning;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
