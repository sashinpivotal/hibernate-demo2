package com.perscholas.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int did;
    private String dname;

    @OneToMany(targetEntity=Teacher.class, cascade = {CascadeType.ALL})
    private List<Teacher> teacherList;

    public Department(int did, String dname) {
        super();
        this.did = did;
        this.dname = dname;
    }

    public Department() {
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
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
}
