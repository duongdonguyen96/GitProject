package com.codegym.customer.model;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    @NotEmpty
//    @Size(min = 5, max = 45)
    private String name;

//    @NotEmpty
//    @Pattern(regexp = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?" +
//            "(\\d{3})(\\s|\\.)?(\\d{3})$")
    private String phone;

//    @Email
//    @NotEmpty
    private String email;


//    @NotEmpty
//    @Min(1)
//    @Max(120)
    private int age;


    public Customer() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
