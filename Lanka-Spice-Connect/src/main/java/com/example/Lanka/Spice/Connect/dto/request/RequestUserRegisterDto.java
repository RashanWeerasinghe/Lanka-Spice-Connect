package com.example.Lanka.Spice.Connect.dto.request;

public class RequestUserRegisterDto {
    private String email;
    private String password;
    private String name;
    private String address;
    private String phone;

    public RequestUserRegisterDto(String email, String password, String name, String address, String phone) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
