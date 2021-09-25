package com.company;

import com.sun.source.tree.IfTree;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Animal {
     String name;
     Integer age;
     Integer sitost;
     Integer moral;
     Integer health;
     Integer mid;
     boolean doSMTHG;
    private static final Random r = new Random();


    public  Animal(String name) {
        this.name = name;
        this.age = r.nextInt(18);
        this.sitost = r.nextInt(100);
        this.moral = r.nextInt(100);
        this.health = r.nextInt(100);
        this.mid = (sitost+moral+health)/3;
        this.doSMTHG = false;
    }
    public static Animal makeCat(){
        Scanner s = new Scanner(System.in);
        System.out.println("введите имя кота");
        String name = s.nextLine();
        System.out.println("введите возраст кота");
        Integer age = s.nextInt();
        Animal cat = new Animal(name);
        cat.setAge(age);
        return cat;
    }

    public static void nextDayChange(Animal animal){
        Integer shok = r.nextInt(2);
        Integer hel =  r.nextInt(3);

        Integer mor = r.nextInt(3);
        if (shok==0){
            animal.moral = animal.moral + mor;
        }else {
            animal.moral = animal.moral - mor;
        }
        Integer shok2 = r.nextInt(2);
        if (shok2==0){
            animal.health = animal.health + hel;
        }else {
            animal.health = animal.health - hel;
        }
        Integer sit = r.nextInt(5);

        animal.sitost = animal.sitost - sit;
    }
    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
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

    public  void changeHealthForFive(){
         this.age = age + 7;
         this.moral = moral - 3;
         this.sitost = sitost - 3;
    }
    public  void changeHealthForTeen(){
        this.age = age + 5;
        this.moral = moral - 5;
        this.sitost = sitost - 5;
    }
    public  void changeHealthForOld(){
        this.age = age + 4;
        this.moral = moral - 6;
        this.sitost = sitost - 6;
    }
    public  void changeSitostForFive(){
        this.sitost = sitost + 7;
    }
    public  void changeSitostForTeen(){

        this.sitost = sitost + 5;
    }
    public  void changeSitostForOld(){

        this.sitost = sitost + 4;
    }
    public  void changeMoralForFive(){
        this.age = age + 7;
        this.moral = moral + 7;
        this.sitost = sitost - 3;
    }
    public  void changeMoralForTeen(){

        this.age = age + 5;
        this.moral = moral + 5;
        this.sitost = sitost - 5;
    }
    public  void changeMoralForOld(){
        this.age = age + 4;
        this.moral = moral + 4;
        this.sitost = sitost - 6;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public static final void toPrint(Animal animal) {
        System.out.println("-----+----------+----------+----------+----------+----------+---------------+");
        String f ="%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|";
        System.out.println(String.format(f, animal.getName(), animal.getAge(), animal.getHealth(), animal.getMoral(), animal.getSitost(), animal.getMid()));
    }
    private static final void printHeader() {
        System.out.println(String.format("|%1$10.10s | %1$-10.10s | %1$-10.10s | %1$-10.10s | %1$-10.10s | %1$-10.10s |", "--------------"));
        System.out.println(String.format("|%10.10s | %-10.10s | %-10.10s | %-10.10s | %-10.10s | %-10.10s |", "имя", "возраст", "здоровье", "настроение", "сытость", "средний уровень"));
        System.out.println(String.format("|%1$10.10s | %1$-10.10s | %1$-10.10s | %1$-10.10s | %1$-10.10s | %1$-10.10s |", "--------------"));
    }

    public static void printCats(List<Animal> animals) {
        printHeader();
        animals.forEach(Animal::toPrint);
        System.out.println();
    }
    public static int byMid(Animal c1, Animal c2) {
        return c2.mid.compareTo(c1.mid);
    }
}
