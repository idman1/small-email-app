package data.models;

import java.time.LocalDateTime;
import java.util.Locale;

public class User {
    private String title;
    private String name;
    private String LastName;
    private int id;
    private Locale country;
    private int age;
    private final LocalDateTime localDateTime = LocalDateTime.now();


    public User() {
    }


    public User(String title, String name, String lastName, int id, Locale country, int age) {
        this.title = title;
        this.name = name;
        LastName = lastName;
        this.id = id;
        this.country = country;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Locale getCountry() {
        return country;
    }

    public void setCountry(Locale country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", id=" + id +
                ", country=" + country +
                ", age=" + age +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
