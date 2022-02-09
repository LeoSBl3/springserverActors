package com.example.springserver;

// Uppgift: Lägg till mer information om filmen. Kanske en regissör, vilket år den kom ut, och i vilket land.

public class Actors {
    private int id;
    private String name;
    private int age;


    //Control + Shift + A  to search for encapsulate field so create the getter and setters
    // as below or toString to create string of the variables

    public int getId() {return id;  }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Actors{" +
                "id=" + id +
                ", name=" + name +
                ", age='" + age + '\'' +
                '}';
    }
}