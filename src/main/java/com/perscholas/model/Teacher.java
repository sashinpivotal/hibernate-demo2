package com.perscholas.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tit;

    private String salary;
    private String Teachername;

    @ManyToOne
    private Department department10;

    public Teacher(int tit, String salary, String teachername) {
        super();
        this.tit = tit;
        this.salary = salary;
        Teachername = teachername;
    }

    public Teacher() {
    }

    public Department getDep() {
        return department10;
    }

    public void setDep(Department department) {
        this.department10 = department;
    }

    public int getTit() {
        return tit;
    }

    public void setTit(int tit) {
        this.tit = tit;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeachername() {
        return Teachername;
    }

    public void setTeachername(String teachername) {
        Teachername = teachername;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tit=" + tit +
                ", salary='" + salary + '\'' +
                ", Teachername='" + Teachername + '\'' +
                '}';
    }
}
