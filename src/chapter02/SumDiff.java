package chapter02;

// 정수의 합과 차
public class SumDiff {
    public static void main(String[] args) {
        // 계산 결과만 표시, 2개의 정수 값 82와 17의 합과 차를 구해서 표시
        System.out.println(82 + 17);
        System.out.println(82 - 17);
        System.out.println();

        // 계산식과 결과 표시
        System.out.print("82 + 17 = "); // 문자열 리터럴
        System.out.println(82 + 17); // 정수형 리터럴
        System.out.print("82 - 17 = ");
        System.out.println(82 - 17);
        System.out.println();

        // 계산식과 결과를 println 2번 써서 표시
        System.out.println("82 + 17 = " + (82 + 17));
        System.out.println("82 - 17 = " + (82 - 17));

        // printf() : Format형 출력 (c언어 문법, 자바에서도 지원)
        System.out.printf("82 + 17 = %5d\n", 82 + 17);
        System.out.printf("82 - 17 = %5d\n", 82 - 17);
    }
}
