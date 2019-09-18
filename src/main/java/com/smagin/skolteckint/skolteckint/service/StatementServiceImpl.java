package com.smagin.skolteckint.skolteckint.service;

import com.smagin.skolteckint.skolteckint.dao.api.StatementDao;
import com.smagin.skolteckint.skolteckint.model.Statement;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

    public List<>
}
