package com.lite.ms_agosto_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgostoController {


    @GetMapping("/")
    public String getAgosto() {
        return "Hello from Agosto!";
    }
}
