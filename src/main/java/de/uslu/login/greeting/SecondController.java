package de.uslu.login.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class SecondController {

    @GetMapping
    public String greet() {
        return "Alles gut";
    }

}