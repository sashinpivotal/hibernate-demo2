package com.perscholas.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int did;

    private String dname;

    @OneToMany(mappedBy = "department10", cascade = CascadeType.ALL)
    private List<Teacher> teachers;

    public Department(int did, String dname) {
        super();
        this.did = did;
        this.dname = dname;
    }

    public Department() {
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void removeTeacher(Teacher t1) {
        System.out.println("number of teachers = " + teachers.size());
        teachers.remove(0);
        System.out.println("number of teachers = " + teachers.size());
    }
}
