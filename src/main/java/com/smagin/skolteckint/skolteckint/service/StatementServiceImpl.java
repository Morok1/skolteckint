package com.smagin.skolteckint.skolteckint.service;

import com.smagin.skolteckint.skolteckint.model.DaterType;
import com.smagin.skolteckint.skolteckint.model.Statement;
import com.smagin.skolteckint.skolteckint.service.api.StatementService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;


@Service
public class StatementServiceImpl implements StatementService {


    @Override
    public void save() {

    }

    @Override
    public List<Statement> getAllStatementsByTimePeriod(LocalDateTime start, LocalDateTime end) {
        return null;
    }

    @Override
    public List<Statement> getAllStatementsByType(DaterType type) {
        return null;
    }

    @Override
    public Map<DaterType, Double> getAverageOfDateType() {
        return null;
    }
}
