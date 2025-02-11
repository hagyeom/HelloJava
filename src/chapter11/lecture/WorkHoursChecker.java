package chapter11.lecture;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkHoursChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("현재 시간을 입력하세요 (HH:mm): ");
        String input = scanner.nextLine();

        // 입력된 문자열을 LocalTime.parse()로 변환
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime inputTime = LocalTime.parse(input, formatter);

        // 근무 시간 범위 설정(09:00 ~ 18:00)
        LocalTime workStart = LocalTime.of(9, 0);
        LocalTime workEnd = LocalTime.of(18, 0);

        // 근무 시간 체크
        if (!inputTime.isBefore(workStart) // 입력 시간이 근무 시작시간 이전이 아니고
                && inputTime.isBefore(workEnd)) { // 입력 시간이 근무 종료시간 이전일 경우
            System.out.println("근무 중입니다.");
        } else {
            System.out.println("근무 시간이 아닙니다.");
        }
    }
}
