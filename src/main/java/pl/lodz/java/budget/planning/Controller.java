package pl.lodz.java.budget.planning;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(Model model) {
        return "hello";
    }
}
