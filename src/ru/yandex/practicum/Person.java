package ru.yandex.practicum;

import javax.swing.plaf.PanelUI;

public class Person {

    String name = "Default";
    int age = 0;


    public void sayHi(){
        System.out.println(this.name + " said hi to you");
    }

    public Person(){
    }

}
