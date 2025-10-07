// Main.java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Создаём самолёты
        Airplane boeing = new Airplane("Boeing 737", 180);
        Airplane airbus = new Airplane("Airbus A320", 150);

        // Создаём пассажиров
        List<Passenger> passengers1 = Arrays.asList(
            new Passenger("Анна", 28),
            new Passenger("Борис", 35),
            new Passenger("Вера", 16)
        );

        List<Passenger> passengers2 = Arrays.asList(
            new Passenger("Григорий", 45),
            new Passenger("Дарья", 22),
            new Passenger("Евгений", 17)
        );

        // Создаём рейсы
        List<Flight> flights = Arrays.asList(
            new Flight("SU123", "Москва", boeing, passengers1),
            new Flight("SU456", "Сочи", airbus, passengers2),
            new Flight("SU789", "Москва", boeing, Arrays.asList(new Passenger("Иван", 30)))
        );

        // 1. Поиск рейсов по пункту назначения
        String targetDestination = "Москва";
        List<Flight> moscowFlights = flights.stream()
            .filter(f -> f.getDestination().equals(targetDestination))
            .collect(Collectors.toList());

        System.out.println("=== РЕЙСЫ В " + targetDestination.toUpperCase() + " ===");
        moscowFlights.forEach(System.out::println);

        System.out.println();

        // 2. Фильтрация пассажиров по возрасту (старше 18)
        int minAge = 18;
        List<Passenger> adults = flights.stream()
            .flatMap(f -> f.getPassengers().stream())
            .filter(p -> p.getAge() >= minAge)
            .distinct()
            .collect(Collectors.toList());

        System.out.println("=== ПАССАЖИРЫ СТАРШЕ " + minAge + " ЛЕТ ===");
        adults.forEach(System.out::println);
    }
}
