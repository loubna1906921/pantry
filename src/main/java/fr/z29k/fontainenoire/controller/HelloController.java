package fr.z29k.fontainenoire.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    ResponseEntity<String> hello()
    {
        return ResponseEntity.ok("Hello Fontaine Noire");
    }

}
