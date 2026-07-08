import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map<String, Integer> initialSeats = new HashMap<>();
        initialSeats.put("1AC", 5);
        initialSeats.put("2AC", 10);
        initialSeats.put("3AC", 20);
        initialSeats.put("Sleeper", 50);

        org.example.ReservationSystem system = new org.example.ReservationSystem(initialSeats);

        System.out.println(system.reserveSeats("Sleeper", 10)); // true
        System.out.println(system.getAvailableSeats("Sleeper")); // 40

        System.out.println(system.reserveSeats("1AC", 6)); // false
        System.out.println(system.getAvailableSeats("1AC")); // still 5
    }
}
