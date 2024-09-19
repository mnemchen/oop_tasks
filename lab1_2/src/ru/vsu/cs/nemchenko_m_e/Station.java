package ru.vsu.cs.nemchenko_m_e;

import java.util.List;

public class Station {
    private String name;
    private List<Bus> buses;

    public Station(String name, List<Bus> buses) {
        this.name = name;
        this.buses = buses;
    }

    public String getName() {
        return name;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    public void addBus(Bus bus) {
        buses.add(bus);
        bus.setCurrentStation(this);
    }

    public void removeBus(Bus bus) {
        buses.remove(bus);
    }
}

