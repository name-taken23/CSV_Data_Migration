package com.james.controller;

import java.util.List;

public interface InterfaceDAO<T> {
    void batchInsert(List<T> row);
    void insert(T row);
    T findById(int id);
    List<T> findAll();
}
