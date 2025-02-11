package chapter11.lecture;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// 오늘 날짜 기준으로 올해 크리스마스(12월 25일)까지 남은 일수를 계산하는 프로그램
// 크리스마스가 이미 지났다면, 내년 크리스마스까지 남은 일수를 계산하도록 만들기
public class DaysUntilChristmas {
    public static void main(String[] args) {
        // 오늘 날짜 가져오기
        LocalDate today = LocalDate.now();

        // 올해 크리스마스 날짜 설정
        LocalDate christmas = LocalDate.of(today.getYear(), 12, 25);

        // 만약 크리스마스가 이미 지났다면.. 내년 크리스마스로 변경
        if (today.isAfter(christmas)) {
            christmas = christmas.plusYears(1);
        }

        // 오늘부터 크리스마스까지 남은 일수 계산
        long daysBetween = ChronoUnit.DAYS.between(today, christmas);
        
        // 결과 출력
        System.out.println("오늘 날짜: " + today);
        System.out.println("크리스마스 날짜: " + christmas);
        System.out.println("크리스마스까지 남은 일수: " + daysBetween + "일");
    }
}
