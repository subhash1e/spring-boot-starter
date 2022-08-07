package com.subhash1e.mystudentdb.service;


import java.util.List;

import com.subhash1e.mystudentdb.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}