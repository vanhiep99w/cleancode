package com.clean.code.model;

public class InputConact extends Contact{

    private String country;
    private String website;
    private String companyName;
    private String phone2;


    public InputConact(){

    }

    public InputConact(int id, String firstName, String lastName,
                       String dayOfBirth, String address,
                       String city, String state, String zipCode,
                       String mobilePhone, String email, String country,
                       String website, String companyName, String phone2) {
        super(id, firstName, lastName, dayOfBirth, address, city, state, zipCode, mobilePhone, email);

        this.country = country;
        this.website = website;
        this.companyName = companyName;
        this.phone2 = phone2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
}
