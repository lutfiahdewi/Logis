package com.example.logis.model;

public class Profile {
    private String token;
    private String role;
    private String nama;
    private String username;
    private String email;

    public Profile(String token, String role, String nama, String username, String email) {
        this.token = token;
        this.role = role;
        this.nama = nama;
        this.username = username;
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public String getRole() {
        return role;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
