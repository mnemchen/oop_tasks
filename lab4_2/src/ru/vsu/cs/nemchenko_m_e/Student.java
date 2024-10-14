package ru.vsu.cs.nemchenko_m_e;

public class Student {
    private String id; // Уникальный идентификатор студента (значимое поле)
    private String name;      // Имя студента
    private int age;         // Возраст студента

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        for (char c : id.toCharArray()) {
            hash = hash * 31 + c;
        }
        return hash;
    }

    // Метод для изменения значимого поля id
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

