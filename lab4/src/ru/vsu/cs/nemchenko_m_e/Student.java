package ru.vsu.cs.nemchenko_m_e;

class Student {
    private String lastName;    // Значимое поле
    private String firstName;   // Значимое поле
    private String studentId;   // Значимое поле
    private int age;            // Незначимое поле
    private String address;     // Незначимое поле

    public Student(String lastName, String firstName, String studentId, int age, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentId = studentId;
        this.age = age;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        if (this.hashCode() != student.hashCode()) {
            return false;
        }

        return lastName.equals(student.lastName) &&
                firstName.equals(student.firstName) &&
               studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        int result = 7;

        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);

        return result;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
