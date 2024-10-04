package ru.vsu.cs.nemchenko_m_e;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String name;
    private List<Bus> buses;
    private List<Trolleybus> trolleybuses;

    static {
        System.out.println("Инициализация класса Station. Статический блок");
    }

    {
        System.out.println("Нестатический блок Station");
    }

    public Station(String name) {
        this.name = name;
        buses = new ArrayList<>();
        trolleybuses = new ArrayList<>();
        System.out.println("Создается объект класса Station с названием: " + name);
    }

    public String getName() {
        return name;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public List<Trolleybus> getTrolleybuses() {
        return trolleybuses;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            buses.add((Bus) vehicle);
        } else if (vehicle instanceof Trolleybus) {
            trolleybuses.add((Trolleybus) vehicle);
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            buses.remove((Bus) vehicle);
        } else if (vehicle instanceof Trolleybus) {
            trolleybuses.remove((Trolleybus) vehicle);
        }
    }
}





