package com.tpe.service;

import com.tpe.domain.Student;

import java.util.List;

public interface StudentService {
    //neden 2 classs olusturduk?
   // birden fazla class olabilecegi icinbir tane service interface'i olusturduk ki imp edilen classlarda aynı methodları kullanabilsin diye


    void saveStudent(Student student);

    List<Student> getAll();

    Student getStudentById(Long id);

    void deleteStudent(Long id);


}

