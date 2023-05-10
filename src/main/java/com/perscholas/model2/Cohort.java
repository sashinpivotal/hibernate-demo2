package com.perscholas.model2;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cohort")
public class Cohort{

    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    private int cid;

    private String CName;
    private String duration;
    public Cohort() {
    }

    public Cohort( String cName, String duration) {
        this.CName = cName;
        this.duration = duration;
    }

    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCName() {
        return CName;
    }
    public void setCName(String cName) {
        CName = cName;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
}
