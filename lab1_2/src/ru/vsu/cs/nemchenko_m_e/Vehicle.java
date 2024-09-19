package ru.vsu.cs.nemchenko_m_e;

public class Vehicle {
    protected String number;
    protected int capacity;
    protected int currentPassengers;

    public Vehicle(String number, int capacity, int currentPassengers) {
        this.number = number;
        this.capacity = capacity;
        this.currentPassengers = currentPassengers;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCurrentPassengers(int currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

    public void boardPassengers(int passengers) {
        if (currentPassengers + passengers <= capacity) {
            currentPassengers += passengers;
            System.out.println("В транспорт №" + number + " сели " + passengers + " пассажиров");
        } else {
            System.out.println("Не удалось посадить пассажиров в транспорт №" + number + ". Транспорт переполнен");
        }
    }

    public void alightPassengers(int passengers) {
        if (currentPassengers >= passengers) {
            currentPassengers -= passengers;
            System.out.println("Из транспорта №" + number + " вышли " + passengers + " пассажиров");
        } else {
            System.out.println("Недостаточно пассажиров для высадки");
        }
    }
}

