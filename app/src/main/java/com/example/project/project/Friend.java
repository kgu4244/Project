package com.example.project.project;

public class Friend {

    public String email;

    public String Uid;

    public Friend() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getKey() {
        return Uid;
    }

    public void setKey(String key) {
        this.Uid = Uid;
    }
}
