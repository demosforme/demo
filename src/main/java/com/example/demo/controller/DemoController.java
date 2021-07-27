package com.example.demo.controller;

import com.example.demo.mappers.DemoMapper;
import com.example.demo.models.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class DemoController {
    @Autowired
    DemoMapper demoMapper;

    @GetMapping(value = "/demoDetails", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Demo getDemo(@RequestHeader(value = "id") long id) {
        return demoMapper.getDemo(id);
    }
}
