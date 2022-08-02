package com.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class TeacherDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateTeacherDto {

        private String teacherName;
        private Character gender;
        private String phone;
        private String email;
        private String address;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UpdateTeacherDto {

        private Long id;
        private String teacherName;
        private Character gender;
        private String phone;
        private String email;
        private String address;
    }
}
