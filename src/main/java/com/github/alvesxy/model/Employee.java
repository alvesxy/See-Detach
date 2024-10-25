package com.github.alvesxy.model;

import java.io.Serializable;

public class Employee implements Serializable {
    
    private static final long serialVersionUID = 1L;

    // Attributes

    private String email;

    private String name;
    private double salary;
    private char gender;

    // Constructor

    public Employee () {}

    // Getter

    public String getEmail () {
        return email;
    }

    public String getName () {
        return name;
    }

    public double getSalary () {
        return salary;
    }

    public char getGender () {
        return gender;
    }

    // Setter

    public void setEmail (String email) {
        this.email = email;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public void setGender (char gender) {
        this.gender = gender;
    }

    // Compare if is the same email

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

}