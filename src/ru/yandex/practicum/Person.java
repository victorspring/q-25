package ru.yandex.practicum;

import javax.swing.plaf.PanelUI;

public class Person {

    String name = "Default";
    int age = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHi(){
        System.out.println(this.name + " said hi to you");
    }

    public Person(){
    }

}
