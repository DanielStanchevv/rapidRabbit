package com;

public class User {
    private int id;
    private String username;
    private int password;
    private String email;
    private int phone;
    private String address;

    public User(int id, String username, int password, String email, int phone, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
        // Getters

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }
    
        public int getPassword() {
            return password;
        }
    
        public String getEmail() {
            return email;
        }
    
        public int getPhone() {
            return phone;
        }
    
        public String getAddress() {
            return address;
        }
    
        // Setters

        public void setId(int id) {
            this.id = id;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    
        public void setPassword(int password) {
            this.password = password;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public void setPhone(int phone) {
            this.phone = phone;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    }
    
