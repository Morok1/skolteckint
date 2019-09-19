package com.smagin.skolteckint.skolteckint.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DaterType {
    ENGINE("ENGINE"),
    DOOR("DOOR"),
    WHEEL("WHEEL");

    private String description;
}
