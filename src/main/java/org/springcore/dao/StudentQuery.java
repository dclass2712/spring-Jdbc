package org.springcore.dao;

public class StudentQuery {

    final static String GETQUERY = "SELECT * FROM spring_jdbc.student WHERE id = ?";

    final static String UPDATEQUERY = "UPDATE spring_jdbc.student SET student.name=?, student.city=? WHERE id=?";

    final static String GETALLQUERY = "SELECT * FROM spring_jdbc.student";

    final static String DELETEQUERY = "DELETE FROM spring_jdbc.student WHERE id = ?";

    final static String DELETEALLQUERY = "DELETE FROM spring_jdbc.student";

    final static String INSERTQUERY = "INSERT INTO spring_jdbc.student (id, name, city) VALUES (?, ?, ?)";
}
