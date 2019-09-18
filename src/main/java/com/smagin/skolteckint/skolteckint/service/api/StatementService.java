package com.smagin.skolteckint.skolteckint.service.api;

import com.smagin.skolteckint.skolteckint.model.DaterType;
import com.smagin.skolteckint.skolteckint.model.Statement;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface StatementService {
    void save();
    List<Statement> getAllStatementsByTimePeriod(LocalDateTime start, LocalDateTime end);
    List<Statement> getAllStatementsByType(DaterType type);
    Map<DaterType, Double> getAverageOfDateType();
}
