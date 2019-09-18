package com.smagin.skolteckint.skolteckint.dao.api;


import com.smagin.skolteckint.skolteckint.model.DaterType;
import com.smagin.skolteckint.skolteckint.model.Statement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface StatementDao {
    void save(LocalDate date, String dater, int value);
    List<Statement> getAllStatementsByTimePeriod(LocalDateTime start, LocalDateTime end);
    List<Statement> getAllStatementsByType(DaterType type);
    Map<DaterType, Double> getAverageOfDateType();
    List<Statement> getAll();
}
