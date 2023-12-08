package org.springcore.dao;

import java.util.List;

public interface Dao {

    public Student get(int id);
    public List<Student> getAll();
    public Boolean delete(String id);
    public Boolean update(String id, String name, String city);
    public Boolean deleteAll();
    public Boolean create(Student student);
}