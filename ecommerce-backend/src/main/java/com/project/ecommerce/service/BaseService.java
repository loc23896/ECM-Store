package com.project.ecommerce.service;

import java.util.List;

public interface BaseService<T> {
    T create(T t);
    boolean update(T t);
    List<T> findAll();
    boolean delete(Long id);
}
