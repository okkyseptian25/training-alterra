package com.student;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class StudentApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testCreateStudent() {

        Student student = new Student();

        student.setStudentName("Okky Septian");
        student.setGender('M');
        student.setWeight(68.0);
        student.setHeight(165.0);
        student.setPhone("0812345");
        student.setAddress("Jl. Jalan No.123");

        Student res = studentRepository.save(student);

        assertNotNull(res);
    }

    @Test
    public void testGetStudent() {

        Student res = studentRepository.findByStudentName("Okky Septian");

        assertEquals("Okky Septian", res.getStudentName().trim());
    }

    @Test
    public void testGetStudents() {

        List<Student> res = studentRepository.findAll();

        assertThat(res).size().isGreaterThan(0);
    }

    @Test
    public void testUpdateStudent() {

        Student student = studentRepository.findByStudentName("Okky Septian");

        student.setStudentName("Jessica Mila");
        student.setGender('F');
        student.setWeight(40.0);
        student.setHeight(155.0);
        student.setPhone("085704769151");
        student.setAddress("Jl. Tambak No.15 Jakarta");

        Student res = studentRepository.save(student);

        assertEquals("Jessica Mila", res.getStudentName().trim());
    }

    @Test
    public void testDeleteStudent() {

        Student student = studentRepository.findByStudentName("Okky Septian");

        studentRepository.delete(student);

        assertNull(studentRepository.findByStudentName("Okky Septian"));
    }

}
