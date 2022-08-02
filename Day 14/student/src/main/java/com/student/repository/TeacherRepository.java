package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    public Teacher findByTeacherName(String teacher);

}
