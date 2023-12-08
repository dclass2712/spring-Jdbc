package org.springcore;

import org.springcore.dao.Dao;
import org.springcore.dao.Student;
import org.springcore.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Logger logger = Logger.getLogger("App.java");
        System.out.println( "Hello World!" );

//        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("File:src/main/java/org/springcore/config.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        JdbcTemplate studentJdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        Dao studentDao =new StudentDao(studentJdbcTemplate);
        List<Student> students = studentDao.getAll();
        Student student = studentDao.get(2);
        logger.info("Student for id 1: "+students);
//        System.out.println(studentDao.update("8","david","US"));
        System.out.println(studentDao.delete("4"));

    }
}
