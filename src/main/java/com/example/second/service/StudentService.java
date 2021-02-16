package com.example.second.service;

import com.example.second.entities.Student;
import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(int id);

    List<Student> getAllStudents();

    Student getStudentById(int id);
}
