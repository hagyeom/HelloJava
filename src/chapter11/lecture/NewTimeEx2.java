package chapter11.lecture;

import java.time.*;

public class NewTimeEx2 {
    public static void main(String[] args) {
        // 2015년 12월 31일 12시 34분 56초
        LocalDateTime dt1 = LocalDateTime.of(2015, 12, 31, 12, 34, 56);
        LocalDateTime dt2 = LocalDateTime.now();

        System.out.println(dt1); // 2015년 12월 31일 12시 34분 56초
        System.out.println(dt2); // 현재 시간
        System.out.println();
    }
}
