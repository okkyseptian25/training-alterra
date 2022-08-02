package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.TeacherDto.CreateTeacherDto;
import com.student.dto.TeacherDto.UpdateTeacherDto;
import com.student.service.TeacherService;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @SneakyThrows(Exception.class)
    @PostMapping(path = "/teacher", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createTeacher(@RequestBody CreateTeacherDto dto) {

        log.info("POST http://localhost:8080/api/v1/teacher is called...");

        return teacherService.createTeacher(dto);
    }

    @SneakyThrows(Exception.class)
    @GetMapping(path = "/teacher/{teacherName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getTeacher(@PathVariable(name = "teacherName") String teacherName) {

        log.info("GET http://localhost:8080/api/v1/teacher/{} is called...", teacherName);

        return teacherService.getTeacher(teacherName);
    }

    @SneakyThrows(Exception.class)
    @GetMapping(path = "/teachers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getTeachers() {

        log.info("GET http://localhost:8080/api/v1/teachers is called...");

        return teacherService.getTeachers();
    }

    @SneakyThrows(Exception.class)
    @PutMapping(path = "/teacher", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> updateTeacher(@RequestBody UpdateTeacherDto dto) {

        log.info("PUT http://localhost:8080/api/v1/teacher is called...");

        return teacherService.updateTeacher(dto);
    }

    @SneakyThrows(Exception.class)
    @DeleteMapping(path = "/teacher/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> deleteTeacher(@PathVariable(name = "id") Long id) {

        log.info("DELETE http://localhost:8080/api/v1/teacher/{} is called...", id);

        return teacherService.deleteTeacher(id);
    }
}
