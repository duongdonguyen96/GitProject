package com.nguyen.testspring.model;


import javax.persistence.*;

@Entity
@Table(name = "typies")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;

    public Type() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
