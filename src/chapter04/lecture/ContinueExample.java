package chapter04.lecture;

public class ContinueExample {
    public static void main(String[] args) {
        // 짝수만 출력하고 싶어
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) { // 홀수인 경우
                continue;
            }
            System.out.println(i); // 홀수는 실행되지 않음
        }
    }
}
