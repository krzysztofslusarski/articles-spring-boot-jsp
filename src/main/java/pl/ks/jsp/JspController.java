package pl.ks.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class JspController {
    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/2")
    public String hello2() {
        return "hello2";
    }
}
