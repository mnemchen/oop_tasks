package ru.vsu.cs.nemchenko_m_e;

import static ru.vsu.cs.nemchenko_m_e.Bus.getBusCount;
import static ru.vsu.cs.nemchenko_m_e.Trolleybus.getTrolleybusCount;

public class Main {
    public static void main(String[] args) {
        Station station1 = new Station("Станция 1");
        Station station2 = new Station("Станция 2");
        Station station3 = new Station("Станция 3");

        Route route = new Route();
        route.addStation(station1);
        route.addStation(station2);
        route.addStation(station3);

        Bus bus1 = new Bus("A1234");
        Trolleybus trolleybus1 = new Trolleybus("T5678");

        bus1.moveToNextStation(route);
        trolleybus1.moveToNextStation(route);

        bus1.boardPassengers(10);
        trolleybus1.boardPassengers(5);

        bus1.moveToNextStation(route);
        trolleybus1.moveToNextStation(route);

        int busProfit = bus1.calculateProfit();
        int trolleybusProfit = trolleybus1.calculateProfit();

        System.out.println("\nСтатический метод getBusCount: " + getBusCount());
        System.out.println("Статический метод getTrolleybusCount: " + getTrolleybusCount());

        System.out.println("Прибыль автобуса: " + busProfit + " руб.");
        System.out.println("Прибыль троллейбуса: " + trolleybusProfit + " руб.");
    }
}








