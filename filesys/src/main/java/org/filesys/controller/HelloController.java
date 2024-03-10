package org.filesys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*mapping*/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";

    }
}
