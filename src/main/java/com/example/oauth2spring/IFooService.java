package com.example.oauth2spring;

import com.example.oauth2spring.model.Foo;

import java.util.Optional;

public interface IFooService {
    Optional<Foo> findById(Long id);

    Foo save(Foo foo);

    Iterable<Foo> findAll();
}
