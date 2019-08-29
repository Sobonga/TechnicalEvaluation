package com.tasktwo.person;


public final class CurriculumVitae {

    private final PersonalDetails personalDetails;
    private final Qualifications qualifications;
    private final WorkingHistory workingHistory;


    public PersonalDetails getPersonalDetails(){
        return this.personalDetails;
    }

    public Qualifications getQualifications(){
        return this.qualifications;
    }

    public WorkingHistory getWorkingHistory(){
        return this.workingHistory;
    }

    public CurriculumVitae(PersonalDetails personalDetails, Qualifications qualifications, WorkingHistory workingHistory){
        this.personalDetails = personalDetails;
        this.qualifications = qualifications;
        this.workingHistory = workingHistory;


        //Initialize personal details
        this.personalDetails.setName= personalDetails.getName();
        this.personalDetails.setSurname = personalDetails.getSurname();

        //Initialize qualifications

        this.qualifications.setHighestGrade = qualifications.getHighestGrade();
        this.qualifications.setCertification = qualifications.getCertification();

        //Initialize working history
        this.workingHistory.setComapnyName = workingHistory.getComapnyName();
        this.workingHistory.setStartDate= workingHistory.getStartDate();
        this.workingHistory.setEndDate = workingHistory.getEndDate();
    }

}
