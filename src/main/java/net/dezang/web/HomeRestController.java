package net.dezang.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
    @GetMapping("/")
    public ResponseEntity<?> home() {
        return ResponseEntity.ok("Sure!! Why Not?");
    }

    @GetMapping("/keum")
    public ResponseEntity<?> keum() {
        return ResponseEntity.ok("Sure!! keum!");
    }

}