package org.springcore.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {


    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setStudentId(rs.getInt(1));
        student.setStudentName(rs.getString(2));
        student.setStudentCity(rs.getString(3));
        return student;
    }
}
