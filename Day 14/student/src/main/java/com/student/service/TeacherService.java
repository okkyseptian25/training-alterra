package com.student.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student.dto.TeacherDto.CreateTeacherDto;
import com.student.dto.TeacherDto.UpdateTeacherDto;
import com.student.model.Teacher;
import com.student.repository.TeacherRepository;

import lombok.SneakyThrows;
import lombok.val;

@Service
@Transactional(rollbackOn = Exception.class)
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> createTeacher(CreateTeacherDto dto) {

        Map<String, Object> res = new HashMap<String, Object>();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Teacher teacher = new Teacher();

        teacher.setTeacherName(dto.getTeacherName().trim());
        teacher.setGender(dto.getGender());
        teacher.setPhone(dto.getPhone().trim());
        teacher.setEmail(dto.getEmail().trim());
        teacher.setAddress(dto.getAddress().trim());

        teacherRepository.save(teacher);

        res.put("code", HttpStatus.CREATED.value());
        res.put("message", "success");
        res.put("data", teacher);

        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(res);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getTeacher(String teacherName) {

        Map<String, Object> res = new HashMap<String, Object>();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        val std = teacherRepository.findByTeacherName(teacherName);

        if (Optional.ofNullable(std).isPresent()) {
            res.put("message", "success");
            res.put("data", std);
        } else {
            res.put("message", "failed");
            res.put("data", null);
        }

        res.put("code", HttpStatus.OK.value());

        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(res);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getTeachers() {

        Map<String, Object> res = new HashMap<String, Object>();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        val std = teacherRepository.findAll();

        res.put("code", HttpStatus.OK.value());
        res.put("message", "success");
        res.put("data", std);

        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(res);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> updateTeacher(UpdateTeacherDto dto) {

        Map<String, Object> res = new HashMap<String, Object>();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        val teacher = teacherRepository.findById(dto.getId()).orElse(null);

        if (Optional.ofNullable(teacher).isPresent()) {

            teacher.setTeacherName(dto.getTeacherName().trim());
            teacher.setGender(dto.getGender());
            teacher.setPhone(dto.getPhone().trim());
            teacher.setEmail(dto.getEmail().trim());
            teacher.setAddress(dto.getAddress().trim());

            teacherRepository.save(teacher);

            res.put("message", "success");
            res.put("data", teacher);

        } else {
            res.put("message", "failed");
            res.put("data", null);
        }

        res.put("code", HttpStatus.OK.value());

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> deleteTeacher(Long id) {

        Map<String, Object> res = new HashMap<String, Object>();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        val teacher = teacherRepository.findById(id).orElse(null);

        if (Optional.ofNullable(teacher).isPresent()) {

            teacherRepository.deleteById(id);

            res.put("message", "success");
            res.put("data", teacher);

        } else {
            res.put("message", "failed");
            res.put("data", null);
        }

        res.put("code", HttpStatus.OK.value());

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }
}