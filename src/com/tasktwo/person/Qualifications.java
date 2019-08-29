package com.tasktwo.person;

public class Qualifications {

    public String setHighestGrade;
    public String setCertification;
    String highestGrade;

    public String certification;

    public Qualifications(String highestGrade,String certification) {
        this.highestGrade = highestGrade;
        this.certification = certification;
    }

    public String getHighestGrade() {
        return highestGrade;
    }

    public String getCertification() {
        return certification;
    }
}
