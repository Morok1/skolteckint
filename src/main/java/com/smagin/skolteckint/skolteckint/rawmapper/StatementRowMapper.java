package com.smagin.skolteckint.skolteckint.rawmapper;

import com.smagin.skolteckint.skolteckint.model.Statement;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StatementRowMapper implements RowMapper<Statement> {
    @Override
    public Statement mapRow(ResultSet rs, int i) throws SQLException {
        final Statement statement = new Statement();
        statement.setId((long) rs.getInt("id"));
        statement.setDate(rs.getDate("date"));
        statement.setDaterType(rs.getString("daterType"));
        statement.setValue(rs.getInt("date"));

        return null;
    }
}
