package com.smagin.skolteckint.skolteckint.controller;

import com.smagin.skolteckint.skolteckint.model.DaterType;
import com.smagin.skolteckint.skolteckint.model.Statement;
import com.smagin.skolteckint.skolteckint.service.StatementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class StatementController {
    @Autowired
    private StatementServiceImpl statementService;

    @GetMapping("/hello")
    private String hello(){
        return "Hello";
    }

    @GetMapping("/all_statements")
    public List<Statement> getAll(){
        return statementService.getAll();
    }

    @GetMapping("/date")
    public List<Statement> getDate(@RequestParam("time_start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date time_start,
                        @RequestParam("time_end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date time_end ){

        List<Statement>  statements = statementService.getAllStatementsByTimePeriod(time_start, time_end);

        return statements;
    }

    @GetMapping("/statements_by_date/{start_date}/{end_date}")
    public List<Statement> getAllStatementsByTimePeriod(@PathVariable("start_date") Date startDate,
                                                        @PathVariable("end_date") Date timeEnd){
        return statementService.getAllStatementsByTimePeriod(startDate, timeEnd);
    }

    @GetMapping("/daters")
    public Map<DaterType, Double> getAllStatementByTimePeriod(){
        return statementService.getAllStatementByTimePeriod();
    }
}
