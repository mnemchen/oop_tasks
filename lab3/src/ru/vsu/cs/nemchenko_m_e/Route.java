package ru.vsu.cs.nemchenko_m_e;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private List<Station> stations;

    static {
        System.out.println("Инициализация класса Route. Статический блок");
    }

    {
        System.out.println("Нестатический блок Route");
    }

    public Route() {
        this.stations = new ArrayList<>();
        System.out.println("Создается объект класса Route");
    }

    public List<Station> getStations() {
        return stations;
    }

    public void addStation(Station station) {
        stations.add(station);
    }
}

