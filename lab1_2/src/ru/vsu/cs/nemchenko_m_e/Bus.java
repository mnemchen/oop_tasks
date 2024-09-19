package ru.vsu.cs.nemchenko_m_e;

import java.util.List;

public class Bus extends Vehicle {
    private Station currentStation;
    private Route route;

    public Bus(String number, int capacity, int currentPassengers, Station currentStation, Route route) {
        super(number, capacity, currentPassengers);
        this.currentStation = currentStation;
        this.route = route;
    }

    public Station getCurrentStation() {
        return currentStation;
    }

    public Route getRoute() {
        return route;
    }

    public void setCurrentStation(Station currentStation) {
        this.currentStation = currentStation;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void moveToNextStation() {
        if (route == null) {
            System.out.println("Маршрут для автобуса не назначен");
            return;
        }

        List<Station> stations = route.getStations();
        if (stations.isEmpty()) {
            System.out.println("Маршрут не содержит станций");
            return;
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
}
