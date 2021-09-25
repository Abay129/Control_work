package com.company;

import java.util.Random;

public class Animal {
    String name;
    Integer age;
    Integer sitost;
    Integer moral;
    Integer health;
    Integer mid;
    Random r = new Random();

    public Animal(String name) {
        this.name = name;
        this.age = r.nextInt(18);
        this.sitost = r.nextInt(100);
        this.moral = r.nextInt(100);
        this.health = r.nextInt(100);
        this.mid = (sitost+moral+health)/3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSitost() {
        return sitost;
    }

    public void setSitost(Integer sitost) {
        this.sitost = sitost;
    }

    public Integer getMoral() {
        return moral;
    }

    public void setMoral(Integer moral) {
        this.moral = moral;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
