package com.smagin.skolteckint.skolteckint.dao;

import com.smagin.skolteckint.skolteckint.model.DaterType;
import com.smagin.skolteckint.skolteckint.model.Statement;
import com.smagin.skolteckint.skolteckint.rawmapper.StatementRowMapper;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Log
public class StatementStatementDao implements com.smagin.skolteckint.skolteckint.dao.api.StatementDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(LocalDate date, String dater, int value) {
        jdbcTemplate.update("INSERT INTO STATEMENT VALUES (date, dater, value)", 5, "2019-09-09",1,1);
    }


    @Override
    public List<Statement> getAllStatementsByTimePeriod(Date start, Date endTime) {

        return jdbcTemplate.query("select * from STATEMENT where DATE_VALUE between '2019-01-10' and '2020-01-11'",
                new StatementRowMapper());
    }

    @Override
    public List<Statement> getAllStatementsByType(DaterType type) {
        List<Statement> statements = null;
        return statements;
    }

    @Override
    public Map<DaterType, Double> getAverageOfDateType() {
        Map<DaterType, Double> daterTypeDoubleMap =
                new HashMap<>();

        for (DaterType daterType: DaterType.values()) {
            Double averageDateType = jdbcTemplate.queryForObject("SELECT avg(value) FROM STATEMENT where dater="
                    + daterType., Double.class);

            daterTypeDoubleMap.put(daterType, averageDateType);

        }

        return daterTypeDoubleMap;
    }

    @Override
    public List<Statement> getAll() {
        return jdbcTemplate.query("select * from statement", new StatementRowMapper());

    }
}
