package com.javarush.task.sql.task09.task0902;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

/* 
Entity
*/

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "animal_table", schema = "test")
public class Animal {
    @Id
    long id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    int age;

    @Column(name = "family")
    String family;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}