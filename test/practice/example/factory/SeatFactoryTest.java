package practice.example.factory;

import org.junit.jupiter.api.Test;
import practice.example.entity.Seat;
import practice.example.entity.User;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SeatFactoryTest {
    @Test
    void from() {
        List<Seat> seatList = SeatFactory.getSeats();
        seatList.clear(); // 좌석 리스트 초기화

        int countBefore = seatList.size(); // 길이 0

        Seat seat1 = SeatFactory.from(1);
        Seat seat2 = SeatFactory.from(1);

        int countAfter = seatList.size(); // 길이 1이 되야함

        assertThat(countAfter).isEqualTo(countBefore + 1);
        assertThat(seat1).isSameAs(seat2);
    }

}