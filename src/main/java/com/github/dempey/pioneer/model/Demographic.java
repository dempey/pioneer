package com.github.dempey.pioneer.model;

import java.sql.Date;

//@Entity
public class Demographic {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @NotEmpty
    private String firstName;

//    @NotEmpty
    private String lastName;

//    @NotEmpty
    private Date birthDate;

//    @NotEmpty
    private String gender;

//    @NotEmpty
    private String streetAddress;

//    @NotEmpty
    private String city;

//    @NotEmpty
    private String state;

//    @NotEmpty
    private Long zipCode;

    private String interests;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }
}
