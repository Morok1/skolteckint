package com.smagin.skolteckint.skolteckint.model;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Statement {
    @NotNull
    private Long id;
    @NotNull
    private Date date;
    @NotNull
    private String daterType;
    @NotNull
    private Integer value;
}


