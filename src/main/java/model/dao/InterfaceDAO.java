package model.dao;

import model.entity.Athlete;

import java.util.List;

public interface InterfaceDAO<T> {
    void create(T t);
    List<T> find();
    void update(T t);
    void delete(T t);
}
