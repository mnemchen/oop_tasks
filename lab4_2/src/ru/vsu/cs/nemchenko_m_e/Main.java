package ru.vsu.cs.nemchenko_m_e;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student student1 = new Student("001", "Алексей Иванов", 20);
        students.add(student1);

        System.out.println("Содержит Алексей Иванов? " + students.contains(new Student("001", "Алексей Иванов", 20)));

        // Изменяем значимое поле id студента
        student1.setId("002");

        System.out.println("Содержит Алексей Иванов с id '001'? " + students.contains(new Student("001", "Алексей Иванов", 20)));

        System.out.println("Содержит Алексей Иванов с id '002'? " + students.contains(student1));

        System.out.println("Размер множества: " + students.size());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


