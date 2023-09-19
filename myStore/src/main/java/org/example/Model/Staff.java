package org.example.Model;

import java.util.UUID;

public abstract class Staff {
    private String name;
    private String employeeId;
    private String startDate;
    private String title;
    private String dateOfBirth;
    private String maritalStatus;
    private String citizenship;
    private String address;
    private String courseOfStudy;
    private String email;
    private String experience;

    public Staff(String name, String employeeId, String startDate, String title, String dateOfBirth, String maritalStatus, String citizenship, String address, String courseOfStudy, String email, String experience) {
        this.name = name;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.citizenship = citizenship;
        this.address = address;
        this.courseOfStudy = courseOfStudy;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public String getAddress() {
        return address;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public String getEmail() {
        return email;
    }

    public String getExperience() {
        return experience;
    }

}