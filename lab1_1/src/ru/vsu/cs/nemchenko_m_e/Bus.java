package ru.vsu.cs.nemchenko_m_e;

import java.util.List;

public class Bus {
    private String number;
    private int capacity;
    private int currentPassengers;
    private Station currentStation;
    private Route route;

    public Bus(String number, int capacity, int currentPassengers, Station currentStation, Route route) {
        this.number = number;
        this.capacity = capacity;
        this.currentPassengers = currentPassengers;
        this.currentStation = currentStation;
        this.route = route;
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

    public Station getCurrentStation() {
        return currentStation;
    }

    public Route getRoute() {
        return route;
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

    public void setCurrentStation(Station currentStation) {
        this.currentStation = currentStation;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void boardPassengers(int passengers) {
        if (currentPassengers + passengers <= capacity) {
            currentPassengers += passengers;
            System.out.println("В автобус №" + number + " сели " + passengers + " пассажиров");
        } else {
            System.out.println("Не удалось посадить пассажиров в автобус №" + number + ". Автобус переполнен");
        }
    }

    public void alightPassengers(int passengers) {
        if (currentPassengers >= passengers) {
            currentPassengers -= passengers;
            System.out.println("Из автобуса №" + number + " вышли " + passengers + " пассажиров");
        } else {
            System.out.println("Недостаточно пассажиров для высадки");
        }
    }

    public void moveToNextStation() {
        if (route == null) {
            System.out.println("Маршрут не назначен для автобуса");
        }

        List<Station> stations = route.getStations();
        if (stations.isEmpty()) {
            System.out.println("Маршрут не содержит станций");
        }

        if (currentStation == null) {
            handleFirstStation(stations);
        } else {
            handleSubsequentStations(stations);
        }
    }

    private void handleFirstStation(List<Station> stations) {
        currentStation = stations.get(0);
        currentStation.addBus(this);
        System.out.println("Автобус №" + number + " прибыл на " + currentStation.getName());
    }

    private void handleSubsequentStations(List<Station> stations) {
        int currentIndex = stations.indexOf(currentStation);
        if (currentIndex < stations.size() - 1) {
            Station nextStation = stations.get(currentIndex + 1);
            currentStation.removeBus(this);
            nextStation.addBus(this);
            currentStation = nextStation;
            System.out.println("Автобус №" + number + " перемещен на " + currentStation.getName());
        } else {
            System.out.println("Автобус №" + number + " достиг конечной станции маршрута");
        }
    }

    @Override
    public String toString() {
        return "Автобус {" +
                "номер = '" + number + "'" +
                ", вместительность = " + capacity +
                ", число пассажиров = " + currentPassengers +
                ", остановка = " + currentStation.getName() +
                ", маршрут = " + route.getRouteNumber() +
                "}";
    }
}
