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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Маршрут {");
        sb.append("номер = '").append(routeNumber).append("'");
        sb.append(", остановки = [");

        for (int i = 0; i < stations.size(); i++) {
            sb.append(stations.get(i).getName());
            if (i < stations.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append("]}");
        return sb.toString();
    }
}
