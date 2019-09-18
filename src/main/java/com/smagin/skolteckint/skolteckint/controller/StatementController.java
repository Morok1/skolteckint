package com.smagin.skolteckint.skolteckint.controller;

import com.smagin.skolteckint.skolteckint.model.Statement;
import com.smagin.skolteckint.skolteckint.service.StatementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatementController {
    @Autowired
    private StatementServiceImpl statementService;

    @GetMapping("/hello")
    private String hello(){
        return "Hello";
    }

    @GetMapping()
    public List<Statement> getAll(){
        return statementService.getAll();
    }
}
