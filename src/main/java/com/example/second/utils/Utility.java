/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.second.utils;

import com.example.second.dto.StudentDto;
import com.example.second.entities.Student;

/**
 *
 * @author mixon
 */
public class Utility {

    public static Student convertToStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setFirstname(studentDto.getFirstname());
        student.setLastname(studentDto.getLastname());
        student.setStandard(studentDto.getStandard());
        return student;
    }



}
