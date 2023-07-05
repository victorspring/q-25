package ru.yandex.practicum.qa;

import ru.yandex.practicum.Employee;
import ru.yandex.practicum.taskmanager.Task;
import ru.yandex.practicum.taskmanager.TaskManager;

import java.util.ArrayList;
import java.util.HashMap;

public class QA3 {

    public static void main(String[] args) {
        double d = 8.8;
        String s = "hello";
        //s.changeString();

        System.out.println(s);

        s = "hello world";
        System.out.println(s.substring(5));
        System.out.println(s);

        s = "hello";
        System.out.println(s);
//        System.out.println(d);

        Employee e = new Employee("Ivan", 20);

        HashMap<ArrayList<Integer>, Employee> map;

        Task task = new Task();
        task.setStatus(Task.STATUS_NEW);
        System.out.println("    ".equals("\t"));
    }
}
