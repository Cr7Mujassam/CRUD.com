package com.first.Crud.Application.Repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.first.Crud.Application.Entiry.Student;

//Student Repositries
public interface StudentRepositries extends JpaRepository<Student, Integer> {

}
