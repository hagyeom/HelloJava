package chapter05;

import java.util.Random;
import java.util.Scanner;

public class MonthCAI { // Computer-Assisted Instruction (컴퓨터 지원 교육)
    public static void main(String[] args) {
        /* 선언부 */
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 랜덤 객체 생성
        Random rand = new Random();

        // 월 문자열 배열 초기화
        String[] monthString = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        }; // index 0 ~ 11


        int retry;

        int last = -1; // 이전 월

        /* 실행부 */
        System.out.println("해당 월의 영어 단어를 입력하시오.");
        System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하시오.");

        // 사용자에게 월 영어 단어 입력 요청 (재진행 요청 시 계속 반복)
        do {
            int monthIndex;

            // 랜덤 월 부여 (바로 이전에 입력한 월이 나오면 다시 뽑음)
            do {
                monthIndex = rand.nextInt(12); // 0 ~ 11 index
            } while (monthIndex == last);

            // 이전 값에 지금 뽑은 값을 대입
            last = monthIndex;

            // 정답 입력 반복문
            while (true) {
                System.out.print((monthIndex + 1) + "월:");
                // 입력한 값을 answer 저장
                String answer = sc.next();

                // answer가 정답인지 확인
                if (answer.equals(monthString[monthIndex])) { // 입력한 응답이 정답이라면? 정답 : monthString[monthIndex]
                    break; // 정답이라면 무한루프 탈출
                }

                // 정답이 아니라면 정답을 입력 받기 위해 무한 루프 수행
                System.out.println("틀렸습니다.");
            }

            // 출력부
            System.out.println("정답입니다.");

            System.out.println("다시 한번? 1... Yes/ 0... No");
            // 다시 진행하는 지 여부 묻기
            retry = sc.nextInt();
        } while (retry == 1);
    }
}