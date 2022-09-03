package test.testswagger;

import org.springframework.web.bind.annotation.*;


@RestController
public class BasicController {

    @GetMapping("/api/hello1")
    public String hello1() {
        return "hello";
    }

    @GetMapping("/api/hello2")
    public String hello2(@RequestParam String param) {
        return param;
    }
}