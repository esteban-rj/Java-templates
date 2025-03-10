package com.aspect.demo.controller;

import com.aspect.demo.functions.Math;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class AOPController {

    @Autowired
    private Math math;

    @GetMapping(value = "add")
    public double add(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        System.out.println("Calling Add");
        return this.math.add(a, b);
    }
}