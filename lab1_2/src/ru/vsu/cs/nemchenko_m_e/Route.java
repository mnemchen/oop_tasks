package ru.vsu.cs.nemchenko_m_e;

import java.util.List;

public class Route {
    private String routeNumber;
    private List<Station> stations;

    public Route(String routeNumber, List<Station> stations, List<Bus> buses) {
        this.routeNumber = routeNumber;
        this.stations = stations;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}
