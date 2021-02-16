package com.example.second.controller;

import com.example.second.dto.StudentDto;
import com.example.second.entities.Student;
import com.example.second.exceptions.CustomException;
import com.example.second.service.StudentService;
import com.example.second.utils.Utility;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiOperation(value = "/rest-student", tags = "Student CRUD Controller")
@RestController
@RequestMapping("/rest-student")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    StudentService stdService;

//    @Value("${my.variable}")
//    String message;
    @GetMapping("/rest")
    public String sayHello() {
        return "Hello World";
    }

    @ApiOperation(value = "Get All Students In List", response = Iterable.class)
    @GetMapping("/student")
    public List<Student> getAllStudent() {
        return stdService.getAllStudents();
    }

    @ApiOperation(value = "Get Student By ID", response = ResponseEntity.class)
    @GetMapping("/student/{id}")
    public ResponseEntity<Object> getStudentById(@PathVariable("id") int id) {
        Student student = stdService.getStudentById(id);
        if (student == null) {
            throw new CustomException();
        }

        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody StudentDto studentDto) {
        return stdService.saveStudent(Utility.convertToStudent(studentDto));
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable("id") int id, @RequestBody StudentDto studentDto) {
        studentDto.setId(id);
        return stdService.updateStudent(Utility.convertToStudent(studentDto));
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        stdService.deleteStudent(id);
    }

    @GetMapping("/show")
    public void show() {
        System.out.println("AOP SUCCESSFUL !!");
    }
}
