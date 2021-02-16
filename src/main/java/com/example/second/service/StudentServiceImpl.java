package com.example.second.service;

import com.example.second.entities.Student;
import com.example.second.repos.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository stdRepo;

    @Override
    public Student saveStudent(Student student) {
        return stdRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return stdRepo.findAll();
    }

    @Override
    public void deleteStudent(int id) {
        stdRepo.deleteById(id);
    }

    @Override
    public Student getStudentById(int id) {
        return stdRepo.findById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        Student studentResponse = stdRepo.findById(student.getId());
        studentResponse.setFirstname(student.getFirstname());
        studentResponse.setLastname(student.getLastname());
        studentResponse.setStandard(student.getStandard());
        return stdRepo.save(studentResponse);
    }

}
