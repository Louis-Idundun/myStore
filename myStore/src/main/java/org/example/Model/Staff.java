package org.example.Model;

import java.util.UUID;

public abstract class Staff {
    private String name;
    private long employeeId;
    private String startDate;
    private String title;
    private String dateOfBirth;
    private String maritalStatus;
    private String citizenship;
    private String address;
    private String courseOfStudy;
    private String email;
    private String experience;

    public Staff(String name, long employeeId, String startDate, String title, String dateOfBirth, String maritalStatus, String citizenship, String address, String courseOfStudy, String email, String experience) {
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

    public long getEmployeeId() {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", startDate='" + startDate + '\'' +
                ", title='" + title + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", address='" + address + '\'' +
                ", courseOfStudy='" + courseOfStudy + '\'' +
                ", email='" + email + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}