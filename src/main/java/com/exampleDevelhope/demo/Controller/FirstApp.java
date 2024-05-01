package com.exampleDevelhope.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApp {
    @GetMapping("v1/ciao")


    public  String getSaluto(@RequestParam String nome, @RequestParam String provincia){
        String saluto1 = "Ciao ";
        String saluto2 = " com'è il tempo in ";
        String saluto3 = "?";
        return saluto1+nome+saluto2+provincia+saluto3;
    }

}
