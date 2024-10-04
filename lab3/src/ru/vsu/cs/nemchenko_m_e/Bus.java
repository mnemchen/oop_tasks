package ru.vsu.cs.nemchenko_m_e;

public class Bus extends Vehicle {
    private static int busCount = 0; // Статическое поле
    public static final int FARE = 35; // Статическая константа

    static {
        System.out.println("Инициализация класса Bus. Статический блок");
    }

    {
        System.out.println("Нестатический блок Bus");
    }

    public Bus(String number) {
        super(number);
        busCount++;
        System.out.println("Создается объект класса Bus с номером: " + number);
    }

    // Переопределяем метод
    @Override
    public void moveToNextStation(Route route) {
        if (currentStation == null) {
            currentStation = route.getStations().getFirst();
            currentStation.addVehicle(this);
            System.out.println("\nАвтобус №" + number + " прибыл на " + currentStation.getName());
        } else {
            int currentIndex = route.getStations().indexOf(currentStation);
            if (currentIndex < route.getStations().size() - 1) {
                Station nextStation = route.getStations().get(currentIndex + 1);
                currentStation.removeVehicle(this);
                nextStation.addVehicle(this);
                currentStation = nextStation;
                System.out.println("Автобус №" + number + " перемещен на " + currentStation.getName());
            } else {
                System.out.println("Автобус №" + number + " достиг конечной станции маршрута");
            }
        }
    }

    // Переопределяем метод
    @Override
    protected int getFare() {
        return FARE;
    }

    // Статический метод (относится к классу, а не к объекту)
    public static int getBusCount() {
        return busCount;
    }
}







