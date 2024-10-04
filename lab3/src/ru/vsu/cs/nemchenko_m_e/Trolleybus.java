package ru.vsu.cs.nemchenko_m_e;

public class Trolleybus extends Vehicle {
    private static int trolleybusCount = 0; // Статическое поле
    public static final int FARE = 40; // Статическая константа

    static {
        System.out.println("Инициализация класса Trolleybus. Статический блок");
    }

    {
        System.out.println("Нестатический блок Trolleybus");
    }

    public Trolleybus(String number) {
        super(number);
        trolleybusCount++;
        System.out.println("Создается объект класса Trolleybus с номером: " + number);
    }

    // Переопределяем метод
    @Override
    public void moveToNextStation(Route route) {
        if (currentStation == null) {
            currentStation = route.getStations().getFirst();
            currentStation.addVehicle(this);
            System.out.println("Троллейбус №" + number + " прибыл на " + currentStation.getName());
        } else {
            int currentIndex = route.getStations().indexOf(currentStation);
            if (currentIndex < route.getStations().size() - 1) {
                Station nextStation = route.getStations().get(currentIndex + 1);
                currentStation.removeVehicle(this);
                nextStation.addVehicle(this);
                currentStation = nextStation;
                System.out.println("Троллейбус №" + number + " перемещен на " + currentStation.getName());
            } else {
                System.out.println("Троллейбус №" + number + " достиг конечной станции маршрута");
            }
        }
    }

    // Переопределяем метод
    @Override
    protected int getFare() {
        return FARE;
    }

    // Статический метод
    public static int getTrolleybusCount() {
        return trolleybusCount;
    }
}









