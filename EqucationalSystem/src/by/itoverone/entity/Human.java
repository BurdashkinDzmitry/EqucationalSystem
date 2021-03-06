package by.itoverone.entity;

import java.util.Objects;

public class Human {
    private int id;
    private String name;
    private String gender;
    private int age;

    public Human(String name) {this.name = name;}

    public Human(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
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

    public void setName(String name) {this.name = name;}

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id && age == human.age && Objects.equals(name, human.name) && Objects.equals(gender, human.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, age);
    }
}

