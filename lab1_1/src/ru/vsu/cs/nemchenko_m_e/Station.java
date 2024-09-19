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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Остановка {");
        sb.append("название = '").append(name).append("'");
        sb.append(", автобусы = [ ");

        for (Bus bus : buses) {
            sb.append(bus.getNumber()).append(" ");
        }

        sb.append("]}");
        return sb.toString();
    }
}

