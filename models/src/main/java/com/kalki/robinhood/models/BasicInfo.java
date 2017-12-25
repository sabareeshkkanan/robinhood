package com.kalki.robinhood.models;

import java.time.ZonedDateTime;

public class BasicInfo {
    private String phone_number;

    private String zipcode;

    private String tax_id_ssn;

    private String state;

    private String date_of_birth;

    private String citizenship;

    private String city;

    private ZonedDateTime updated_at;

    private String country_of_residence;

    private String address;

    private String marital_status;

    private Integer number_dependents;

    private String user;

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getTax_id_ssn() {
        return tax_id_ssn;
    }

    public void setTax_id_ssn(String tax_id_ssn) {
        this.tax_id_ssn = tax_id_ssn;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getCountry_of_residence() {
        return country_of_residence;
    }

    public void setCountry_of_residence(String country_of_residence) {
        this.country_of_residence = country_of_residence;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public Integer getNumber_dependents() {
        return number_dependents;
    }

    public void setNumber_dependents(Integer number_dependents) {
        this.number_dependents = number_dependents;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ZonedDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(ZonedDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
