package de.uslu.login.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class Controller {
    
    @GetMapping
    public String greet(Principal principal) {
        return "Hallooo!" + principal.getName();
    }

    
}
