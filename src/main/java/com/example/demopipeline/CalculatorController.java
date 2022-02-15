package com.example.demopipeline;

import com.example.demopipeline.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private Calculator calculator;
    @RequestMapping("/sum")
    String sum(@RequestParam(name = "a")Integer a, @RequestParam(name = "b")Integer b){
        return String.valueOf(calculator.sum(a,b));
    }

}
