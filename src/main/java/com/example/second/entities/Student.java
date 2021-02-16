package com.example.second.entities;

import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    @ApiModelProperty(notes = "ID of Student", name = "id", required = true, value = "integer(1/2/3/4.....)")
    int id;

    @Column(name = "firstname")
    @ApiModelProperty(notes = "Firstname of student", name = "Firstname", required = true, value = "String Value")
    String firstname;

    @Column(name = "lastname")
    @ApiModelProperty(notes = "Lastname of the Student", name = "Lastname", required = true, value = "String Value)")
    String lastname;

    @Column(name = "standard")
    @ApiModelProperty(notes = "Standard of the Student", name = "Standard", required = true, value = "integer(11/12)")
    int standard;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

}
