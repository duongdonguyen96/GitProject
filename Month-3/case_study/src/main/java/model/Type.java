package model;

import java.util.List;

public class Type {
    private int id;
    private String name;

    Type() {

    }

    public Type(String name) {
        this.name = name;

    }

    public Type(int id, String name) {
        this.id = id;
        this.name = name;
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
}