package com.clean.code.model;

import com.clean.code.constant.Constans;
import com.clean.code.validator.annotation.State;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public class Contact {

    @NotNull(message = "ID can't null")
    private int id;

    @NotBlank(message = "FirstName is empty")
    @Length(max = 10, message = "FirstName length is over 10")
    private String firstName;

    @NotBlank(message = "LastName is empty")
    @Length(max = 10, message = "LastName length is over 10")
    private String lastName;

    @NotBlank(message = "DayOfBirth is empty")
    @Length(min = 10, max = 10, message = "DayOfBitrth is invalid")
    private String dayOfBirth;

    @Length(max = 20, message = "Address length is over 20")
    private String address;

    @Length(max = 15, message = "City length is over 15")
    private String city;

    @State(message = "State is invalid")
    private String state;

    @Pattern(regexp = "^\\d{4,5}$", message = "Zipcode is not four or five digits")
    private String zipCode;

    @Pattern(regexp = "^\\d{3}\\-\\d{3}\\-\\d{4}$", message = "Mobiphone is invalid format XXX-XXX-XXXX")
    private String mobilePhone;

    @Email(message = "Email is invalid")
    private String email;

    private int age;

    public Contact(){

    }

    public Contact(int id, String firstName, String lastName, String dayOfBirth, String address, String city, String state, String zipCode, String mobilePhone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        if(dayOfBirth != null && !"".equals(dayOfBirth.trim())){
            String yearStr = dayOfBirth.split("/")[2];
            int year = Integer.parseInt(yearStr);
            this.age = Constans.REPORT_YEAR - year;
        }

    }
}
