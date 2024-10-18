package ru.vsu.cs.nemchenko_m_e;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Иванов", "Иван", "123", 20, "Москва");
        Student student2 = new Student("Иванов", "Иван", "123", 22, "Санкт-Петербург");

        System.out.println("student1 equals student2: " + student1.equals(student2));


        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);

        System.out.println("\nArrayList содержит student1: " + studentList.contains(student1));
        System.out.println("ArrayList содержит student2: " + studentList.contains(student2));
        System.out.println("Размер ArrayList: " + studentList.size());
        studentList.remove(student2);
        System.out.println("Размер ArrayList после удаления student2: " + studentList.size());


        HashSet<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        System.out.println("\nРазмер HashSet: " + students.size());


        HashMap<Student, String> studentMap = new HashMap<>();
        studentMap.put(student1, "Студент 1");

        System.out.println("\nHashMap содержит student1: " + studentMap.containsKey(student1));
        student1.setAddress("Новосибирск");
        System.out.println("После изменения незначимого поля");
        System.out.println("HashMap содержит student1: " + studentMap.containsKey(student1));
        student1.setStudentId("234");
        System.out.println("После изменения значимого поля");
        System.out.println("HashMap содержит student1: " + studentMap.containsKey(student1));
        System.out.println("Проверка 1 - " + studentMap.get(student1));
        System.out.println("Проверка 2 - "+ studentMap.get
                (new Student("Иванов", "Иван", "234", 20, "Москва")) + "\n");

    }

    public static <T> void printList(ArrayList<T> list) {
        System.out.println("Содержимое ArrayList:");
        for (T element : list) {
            System.out.println("Элемент: " + element);
        }
    }

    public static <T> void printSet(HashSet<T> set) {
        System.out.println("Содержимое HashSet:");
        for (T element : set) {
            System.out.println("Элемент: " + element);
        }
    }

    public static <K, V> void printMap(HashMap<K, V> map) {
        System.out.println("Содержимое HashMap:");
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}
