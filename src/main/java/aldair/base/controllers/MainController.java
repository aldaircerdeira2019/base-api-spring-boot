package aldair.base.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

    @GetMapping()
    public ResponseEntity<String> getAbout() {
        return ResponseEntity.ok("Spring Boot 4.0.1 - base project");
    } 
}
