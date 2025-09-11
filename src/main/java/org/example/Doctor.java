package org.example;

public class Doctor {
    public String name, surname;
    public String post;
    public Doctor(String name, String surname, String post){
        this.name = name;
        this.surname = surname;
        this.post = post;
    }

    public void ShowName(){
        System.out.printf(name, surname);
    }
}
