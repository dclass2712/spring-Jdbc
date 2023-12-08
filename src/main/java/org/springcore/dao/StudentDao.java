package org.springcore.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDao implements Dao{

    JdbcTemplate jdbcTemplate;

    public StudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student get(int id) {
//        RowMapper<Student> studentRowMapper = new StudentRowMapper();
        return jdbcTemplate.queryForObject(StudentQuery.GETQUERY, ((rs, rowNum) -> {
            Student student = new Student();
            student.setStudentId(rs.getInt(1));
            student.setStudentName(rs.getString(2));
            student.setStudentCity(rs.getString(3));
            return student;
        } ), id);
    }

    @Override
    public List<Student> getAll() {
        RowMapper<Student> studentRowMapper = new StudentRowMapper();
        List<Student> students = jdbcTemplate.query(StudentQuery.GETALLQUERY, ((rs, rowNum) -> {
            Student student = new Student();
            student.setStudentId(rs.getInt(1));
            student.setStudentName(rs.getString(2));
            student.setStudentCity(rs.getString(3));
            return student;
        }));
        return students;
    }

    @Override
    public Boolean delete(String id) {
        return ((jdbcTemplate.update(StudentQuery.DELETEQUERY,id)) == 1);
    }

    @Override
    public Boolean deleteAll() {
        return ((jdbcTemplate.update(StudentQuery.DELETEALLQUERY)) == 1);
    }

    @Override
    public Boolean create(Student student) {
        return ((jdbcTemplate.update(StudentQuery.INSERTQUERY, student.getStudentId(), student.getStudentName(), student.getStudentCity())) == 1);
    }

    @Override
    public Boolean update(String id, String name, String city) {
        return ((jdbcTemplate.update(StudentQuery.UPDATEQUERY, name, city, id)) == 1);
    }
}
