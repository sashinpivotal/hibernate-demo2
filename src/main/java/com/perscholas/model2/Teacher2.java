package com.perscholas.model2;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Teacher2")
public class Teacher2 {

    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    private int tit;
    private String salary;
    private String TeacherName;

    @ManyToMany()
    private Set<Cohort> CohortSet;

    public Teacher2() {
        super();
    }

    public Teacher2(String salary, String teacherName, Set CohortSet) {
        this.salary = salary;
        this.TeacherName = teacherName;
        this.CohortSet = CohortSet;

    }

    public Set getCohortSet() {
        return CohortSet;
    }
    public void setCohortSet(Set cohortSet) {
        CohortSet = cohortSet;
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
    public String getTeacherName() {
        return TeacherName;
    }
    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }
}

