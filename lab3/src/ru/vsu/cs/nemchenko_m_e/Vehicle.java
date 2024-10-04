package ru.vsu.cs.nemchenko_m_e;

public class Vehicle {
    protected String number;
    protected int currentPassengers;
    protected Station currentStation;

    static {
        System.out.println("Инициализация класса Vehicle. Статический блок");
    }

    {
        System.out.println("Нестатический блок Vehicle");
    }

    public Vehicle(String number) {
        this.number = number;
        this.currentPassengers = 0;
        System.out.println("Создается объект класса Vehicle с номером: " + number);
    }

    // Переопределён в наследниках
    protected void moveToNextStation(Route route) {
    }

    // Переопределён в наследниках
    protected int getFare() {
        return 0;
    }

    public int calculateProfit() {
        return currentPassengers * getFare();
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public String getNumber() {
        return number;
    }

    public void boardPassengers(int count) {
        currentPassengers += count;
        System.out.println("На " + number + " село " + count + " пассажиров. Текущее количество: " + currentPassengers);
    }
}



