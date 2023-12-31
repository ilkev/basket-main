package com.spring.basket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class BasketService {
    private final List<Long> id = new ArrayList<>();

    public void add(List<Long> id) {
        this.id.addAll(id);
    }

    public List<Long> getAll() {
        return Collections.unmodifiableList(id);
    }
}
