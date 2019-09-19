package com.smagin.skolteckint.skolteckint.service;

import com.smagin.skolteckint.skolteckint.dao.api.StatementDao;
import com.smagin.skolteckint.skolteckint.model.DaterType;
import com.smagin.skolteckint.skolteckint.model.Statement;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
@Log
public class StatementServiceImpl {
    @Autowired
    private StatementDao dao;

    public List<Statement> getAll() {
        log.info("Method getAll is performed...");

        List<Statement> statements = dao.getAll();

        log.info("Method getAll is performed... Done");

        return statements;
    }

    public List<Statement> getAllStatementsByTimePeriod(Date start, Date end){
        log.info("Method getAllStatementByTimePeriod begin works ...");

        List<Statement> statements = dao.getAllStatementsByTimePeriod(start, end);

        log.info("Method getAllStatementByTimePeriod begin works ... Done");
        return statements;
    }

    public Map<DaterType, Double> getAllStatementByTimePeriod(){
        log.info("Method getAllStatementByTimePeriod begin works ...");

        Map<DaterType, Double> daterTypeDoubleMap  = dao.getAverageOfDateType();

        log.info("Method getAllStatementByTimePeriod begin works ... Done");

        return daterTypeDoubleMap;
    }
}
