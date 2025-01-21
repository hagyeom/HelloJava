package practice.example;

import practice.example.entity.Reservation;
import practice.example.entity.Seat;
import practice.example.entity.User;
import practice.example.factory.UserFactory;
import practice.example.factory.SeatFactory;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        System.out.println(SeatFactory.getSeats());

        Seat seat1 = SeatFactory.from(6);
        Seat seat2 = SeatFactory.from(6);

        System.out.println(SeatFactory.getSeats());

        System.out.println("seat1 == seat2? " + seat1.equals(seat2));
    }

}
