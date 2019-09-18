package com.smagin.skolteckint.skolteckint.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum DaterType {
    ENGINE,
    DOOR,
    WHEEL;

    private String description;
}
