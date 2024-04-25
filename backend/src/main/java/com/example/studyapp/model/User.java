package com.example.studyapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String name;
    private String pic;
    private String email;
    private String pw;

    // Ajoutez les constructeurs, les méthodes getters/setters et d'autres champs au besoin

    public User() {
    }

    public User(String name, String pic) {
        this.name = name;
        this.pic = pic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getPic(){
        return this.pic;
    }
    public void setPic(String pic){
        this.pic = pic;
    }
    public String getEmain(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPw(){
        return this.pw;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
}
