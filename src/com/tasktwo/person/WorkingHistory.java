package com.tasktwo.person;

import java.util.Date;

public class WorkingHistory {

    public Date setEndDate;
    public Date setStartDate;
    public String setComapnyName;
    String ComapnyName;

    public Date startDate;

    public Date endDate;

    public WorkingHistory(String comapnyName, Date startDate, Date endDate) {
        ComapnyName = comapnyName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getComapnyName() {
        return ComapnyName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
