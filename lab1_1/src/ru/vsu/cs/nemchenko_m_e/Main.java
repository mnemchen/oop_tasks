package ru.vsu.cs.nemchenko_m_e;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Station station1 = new Station("Проспект Революции", new ArrayList<>());
        Station station3 = new Station("Улица Плехановская", new ArrayList<>());

        Station station4 = new Station("Северный мост", new ArrayList<>());
        Station station5 = new Station("Центральный рынок", new ArrayList<>());
        Station station6 = new Station("Улица Карла Маркса", new ArrayList<>());

        List<Station> stations1 = new ArrayList<>();
        stations1.add(station1);
        stations1.add(station5);
        stations1.add(station3);

        List<Station> stations2 = new ArrayList<>();
        stations2.add(station4);
        stations2.add(station5);
        stations2.add(station6);

        List<Bus> buses = new ArrayList<>();
        Route route1 = new Route("Маршрут 1", stations1, buses);
        Route route2 = new Route("Маршрут 2", stations2, buses);

        Bus bus1 = new Bus("5", 60, 0, null, route1);
        Bus bus2 = new Bus("90", 72, 0, null, route2);

        bus1.moveToNextStation();
        bus2.moveToNextStation();
        System.out.println();

//        System.out.println("\nСостояние станций:");
//        System.out.println(station1.toString());
//        System.out.println(station4.toString() + "\n");

        bus1.boardPassengers(10);
        bus2.boardPassengers(7);
        System.out.println();

//        System.out.println("\nСостояние автобусов:");
//        System.out.println(bus1.toString());
//        System.out.println(bus2.toString() + "\n");

        bus1.moveToNextStation();
        bus2.moveToNextStation();
        System.out.println();

//        System.out.println("\nСостояние станций после перемещения:");
//        System.out.println(station5.toString() + "\n");

        bus1.alightPassengers(3);
        bus2.alightPassengers(7);
        System.out.println();


//        System.out.println("\nСостояние автобусов после перемещения:");
//        System.out.println(bus1.toString());
//        System.out.println(bus2.toString() + "\n");

        bus1.moveToNextStation();
        bus2.moveToNextStation();
        System.out.println();

        bus2.boardPassengers(100);
        System.out.println();

        bus1.moveToNextStation();
        bus2.moveToNextStation();
    }
}
