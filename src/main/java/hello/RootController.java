// https://spring.io/guides/gs/serving-web-content/

package main.java.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {

    @GetMapping("/")
    public String toIndex() {
        return "index";
    }

}