package com.tasktwo.person;

public class PersonalDetails {
    public String setName;
    public String setSurname;
    String name;

    public String surname;

    public PersonalDetails(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
