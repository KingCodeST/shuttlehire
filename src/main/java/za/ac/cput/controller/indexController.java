package za.ac.cput.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class indexController {

    @RequestMapping(value = {"/","CarHire"})
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("Welcome to Big Project 2!", HttpStatus.OK);
    }


}
