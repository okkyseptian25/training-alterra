package com.student;

import com.student.model.Teacher;
import com.student.repository.TeacherRepository;
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
class StudentApplicationTeacherTests {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void testCreateTeacher() {

        Teacher teacher = new Teacher();

        teacher.setTeacherName("Okky Septian");
        teacher.setGender('M');
        teacher.setPhone("0812345");
        teacher.setEmail("email@gmail.com");
        teacher.setAddress("Jl. Jalan No.123");

        Teacher res = teacherRepository.save(teacher);

        assertNotNull(res);
    }

    @Test
    public void testGetTeacher() {

        Teacher res = teacherRepository.findByTeacherName("Okky Septian");

        assertEquals("Okky Septian", res.getTeacherName().trim());
    }

    @Test
    public void testGetTeachers() {

        List<Teacher> res = teacherRepository.findAll();

        assertThat(res).size().isGreaterThan(0);
    }

    @Test
    public void testUpdateTeacher() {

        Teacher teacher = teacherRepository.findByTeacherName("Okky Septian");

        teacher.setTeacherName("Jessica Mila");
        teacher.setGender('F');
        teacher.setPhone("085704769151");
        teacher.setEmail("");
        teacher.setAddress("Jl. Tambak No.15 Jakarta");

        Teacher res = teacherRepository.save(teacher);

        assertEquals("Jessica Mila", res.getTeacherName().trim());
    }

    @Test
    public void testDeleteTeacher() {

        Teacher teacher = teacherRepository.findByTeacherName("Okky Septian");

        teacherRepository.delete(teacher);

        assertNull(teacherRepository.findByTeacherName("Okky Septian"));
    }

}
