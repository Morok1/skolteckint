package com.smagin.skolteckint.skolteckint.dao.api;


import com.smagin.skolteckint.skolteckint.model.Statement;

public interface Dao {
    void save(Statement statement);
    Statement getStatementById(Long id);
}
