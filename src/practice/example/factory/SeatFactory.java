package practice.example.factory;

import practice.example.entity.Seat;

import java.util.ArrayList;
import java.util.List;

public class SeatFactory {
    private static final List<Seat> cache = new ArrayList<>();

    // 더미 데이터 생성
    static {
        cache.add(new Seat(1));
        cache.add(new Seat(2));
        cache.add(new Seat(3));
        cache.add(new Seat(4));
        cache.add(new Seat(5));
    }

    public static Seat from(long id) {
        Seat newSeat = new Seat(id);

        int i;

        if (cache.contains(newSeat)) {
            return cache.get(cache.indexOf(newSeat));
        } else {
            cache.add(newSeat);
        }

        return newSeat;
    }

    public static List<Seat> getSeats() {
        return cache;
    }
}
