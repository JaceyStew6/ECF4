package com.example.RecruitmentManagementApplication.service;

import java.util.List;

public interface IService<T> {
    public List<T> getAll();
    public T getById(int id);
    public T add(T element);
    public void delete(int id);
    public T update(T element);
}
