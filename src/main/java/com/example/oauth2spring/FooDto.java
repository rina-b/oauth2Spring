package com.example.oauth2spring;

public class FooDto {
    private long id;
    private String name;

    public FooDto(Long id, String name) {
        this.name = name;
        this.id = id;
    }

    public FooDto(){}
}
