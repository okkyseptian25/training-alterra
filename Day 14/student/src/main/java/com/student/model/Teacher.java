package com.student.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.student.model.audit.AuditModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Teacher")
@Table(name = "teacher")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = { "createdDate", "lastModifiedDate" })
public class Teacher extends AuditModel<String> implements Serializable {

    private static final long serialVersionUID = -4492412758881190961L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, unique = true)
    private Long id;

    @NotEmpty
    @Column(name = "teacher_name", nullable = false, length = 255)
    private String teacherName;

    @NotNull
    @Column(name = "gender", nullable = false, length = 1)
    private Character gender;

    @Column(name = "phone", nullable = true, length = 12)
    private String phone;

    @Column(name = "email", nullable = true, length = 50)
    private String email;

    @NotEmpty
    @Column(name = "address", nullable = false, columnDefinition = "TEXT")
    private String address;

}
