package com.OBUT.accountservice.entity;

public class Account {

// bu ikisi test amaçlı oldu
    public Account() {
    }

    public Account(String id) {
        this.id = id;
    }
    //buraları Generate edip construction bağladı test amaçlı ilave boş account ve boş string id generate etti
    public Account(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    private String id;
    private String username;
    private String password;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
