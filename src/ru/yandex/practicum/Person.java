package ru.yandex.practicum;

import javax.swing.plaf.PanelUI;

public class Person {

    Num n;
    String name = "Default";
    int age = n.n;

    
    public Person(Num n) {
        this.n = n;
    }

    public void sayHi(){
        System.out.println(this.name + " said hi to you");
    }

    public Person(){
    }

}
