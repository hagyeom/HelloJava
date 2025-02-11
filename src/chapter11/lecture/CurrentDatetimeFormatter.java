package chapter11.lecture;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 특정 형식으로 현재 날짜와 시간 출력하기
public class CurrentDatetimeFormatter {
    public static void main(String[] args) {
        // 현재 날짜와 시간을 가져오기
        LocalDateTime now = LocalDateTime.now();

        // "yyyy/MM/dd - HH:mm:ss" 형식으로 변환
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm:ss");
        String formattedDateTime1 = now.format(formatter);
        // 연도(year) : yyyy(4자리 연도), yy(2자리 연도), y(연도의 한 자릿수)
        // 월(Month) : M(월, 1~12), MM(2자리 월, 01~12), MMM(3자리 월 이름 약어, Jan), MMMM(전체 월 이름, January)
        // 일(Day) : dd(2자리 일, 01~31), d(일, 1~31)
        // 시(Hour) : H(24시간제 시간, 0~23), HH(2자리 24시간제 시간, 00~23)
        // (시계 기준) h(12시간제 시간, 01~12), hh(2자리 12시간제 시간, 01~12)
        // 분(Minute) : mm(2자리 분, 00~59), m(분, 0~59)
        // 초(Second) : ss(2자리 초, 00~59), s(초, 0~59)
        // AM/PM 표시 : a(AM/PM)
        // 시간대(TimeZone) : z(표준시간대), Z 오프셋 시간대(+09:00)
        // ISO 8601 형식 : "yyyy-MM-dd'T'HH:mm:ss'Z'", 'T'는 구분자, 'Z' UTC를 의미
        String formattedDate2 = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'z'"));

        // 변환된 날짜와 시간 출력
        System.out.println("현재 날짜와 시간: " + formattedDateTime1);
        System.out.println("ISO 8601 형식: " + formattedDate2);
        // 한국식 날짜 : 2025년 2월 11일 11:39:01, yyyy년 MM월 dd일
        DateTimeFormatter koreanFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
        String koreanFormattedDateTime = now.format(koreanFormatter);
        
        System.out.println("한국식: " + koreanFormattedDateTime);
        // 서양식 날짜 : 02/11/2025 11:39:01, MM/dd/yyyy
        DateTimeFormatter westernFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        String westernFormattedDateTime = now.format(westernFormatter);
        System.out.println("서양식: " + westernFormattedDateTime);
    }
}
