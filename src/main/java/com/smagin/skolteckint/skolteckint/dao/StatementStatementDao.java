package com.smagin.skolteckint.skolteckint.dao;

import com.smagin.skolteckint.skolteckint.model.DaterType;
import com.smagin.skolteckint.skolteckint.model.Statement;
import com.smagin.skolteckint.skolteckint.rawmapper.StatementRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class StatementStatementDao implements com.smagin.skolteckint.skolteckint.dao.api.StatementDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(LocalDate date, String dater, int value) {
        jdbcTemplate.update("INSERT INTO STATEMENT VALUES (date, dater, value)", 5, "2019-09-09",1,1);
    }

    @Override
    public List<Statement> getAllStatementsByTimePeriod(LocalDateTime start, LocalDateTime endTime) {
        return jdbcTemplate.query("select * from STATEMENT where DATE_VALUE between start and endTime",
                new StatementRowMapper());
    }

    @Override
    public List<Statement> getAllStatementsByType(DaterType type) {
        return null;
    }

    @Override
    public Map<DaterType, Double> getAverageOfDateType() {
        return null;
    }

    @Override
    public List<Statement> getAll() {
        return jdbcTemplate.query("select * from statement", new StatementRowMapper());

    }
}
