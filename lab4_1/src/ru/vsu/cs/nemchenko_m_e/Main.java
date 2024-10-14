package ru.vsu.cs.nemchenko_m_e;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student student1 = new Student("001", "Алексей Иванов", 20);
        students.add(student1);

        System.out.println("Содержит Алексей Иванов? " + students.contains(new Student("001", "Алексей Иванов", 20)));

        // Изменяем имя студента
        student1.setName("Алексей Петров");

        System.out.println("Содержит Алексей Иванов? " + students.contains(new Student("001", "Алексей Иванов", 20)));
        System.out.println("Содержит Алексей Петров? " + students.contains(student1));

        // Создаем другого студента с таким же id
        Student student2 = new Student("001", "Мария Смирнова", 22);
        students.add(student2);

        System.out.println("Содержит Мария Смирнова? " + students.contains(student2));
        System.out.println("Размер множества: " + students.size());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

