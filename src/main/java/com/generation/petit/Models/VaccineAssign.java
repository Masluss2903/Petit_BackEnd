package com.generation.petit.Models;

import java.util.Date;

public class VaccineAssign {

    Date date;
    Integer vaccineId;

    

    public VaccineAssign(Date date, Integer vaccineId) {
        this.date = date;
        this.vaccineId = vaccineId;
    }

    public VaccineAssign() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(Integer vaccineId) {
        this.vaccineId = vaccineId;
    }

    
    
}