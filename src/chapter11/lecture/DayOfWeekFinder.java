package chapter11.lecture;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// 사용자로부터 날짜(형식: yyyy-MM-dd)를 입력 받고, 해당 날짜가 무슨 요일인지 출력하는 프로그램 만들기
public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("날짜를 입력하세요 (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        // 입력된 문자열을 LocalDate로 변환
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(input, formatter);

        // 해당 날짜의 요일 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // 결과 출력
        System.out.println("입력한 날짜의 요일: " + dayOfWeek);
    }
}
