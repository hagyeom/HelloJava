package chapter11.lecture;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaDateTimeExample {
    public static void main(String[] args) {
        // 1. 현재 날짜 및 시간 가져오기
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 날짜 및 시간" + now);

        // 2. 특정 날짜 및 시간 설정
        LocalDateTime birthTime = LocalDateTime.of(2000, 10, 18, 00, 00, 00);
        System.out.println("지정된 날짜 및 시간: " + birthTime);

        // 3. 날짜 연산 (5일 후, 3시간 전)
        LocalDateTime futureDate = now.plusDays(5);
        LocalDateTime pastTime = now.minusHours(3);
        System.out.println("5일 후: " + futureDate);
        System.out.println("3시간 전: " + pastTime);

        // 4. 시간 단위 자르기 (초 단위로 자르기)
        LocalDateTime truncatedTime = now.truncatedTo(ChronoUnit.SECONDS);
        System.out.println("초 단위로 자른 시간: " + truncatedTime);

        // 5. 포맷팅 (출력 형식 변경)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = now.format(formatter);
        System.out.println("포맷팅된 날짜: " + formattedTime);

        // 6. UTC 기준 현재 시간(Instant 사용)
        Instant nowUTC = Instant.now();
        System.out.println("UTC 기준 현재 시간: " + nowUTC);

        // 7. 시간대 포함한 날짜 및 시간
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("서울 기준 현재 시간: " + zonedDateTime1);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("도쿄 기준 현재 시간: " + zonedDateTime2);

        // 8. 두 날짜 차이 계산(Days 단위)
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 2);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("두 날짜 사이의 일수 차이: " + daysBetween + "일");


        // 9. 두 날짜 비교
        boolean isAfter = now.isAfter(birthTime);
        boolean isBefore = now.isBefore(birthTime);
        boolean isEqual = now.isEqual(birthTime);
        System.out.println("현재 날짜가 지정된 날짜 이후인가? " + isAfter);
        System.out.println("현재 날짜가 지정된 날짜 이전인가? " + isBefore);
        System.out.println("현재 날짜와 지정된 날짜가 같은가? " + isEqual);

        // 10. LocalDateTime을 Instant로 변환 (UTC 변환)
        Instant instantFromLDT = now.atZone(ZoneId.systemDefault()).toInstant();
        System.out.println("LocalDateTime -> Instant 변환: " + instantFromLDT);
        System.out.println("ZoneId.systemDefault(): " + ZoneId.systemDefault());
    }
}
