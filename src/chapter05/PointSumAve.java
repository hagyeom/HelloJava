package chapter05;

import java.util.Scanner;

public class PointSumAve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사람 수:");
        int n = sc.nextInt(); // 사람 수 입력 받기
        int[] points = new int[n]; // 배열로 선언해서 그 방 크기를 n만큼 설정


        System.out.println("점수를 입력하세요.");
        int sum = 0;

        // 학생들의 점수를 입력 받기
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "번의 점수:");
            points[i] = sc.nextInt();
            sum += points[i];
        }

        int max = points[0];
        int min = points[0];

        // 최고값, 최저값 구하기
        for (int i = 0; i < points.length; i++) {
            if (points[i] > max) {
                max = points[i];
            } else if (points[i] < min) {
                min = points[i];
            }
        }

        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균는 " + (double) sum / n + "입니다.");
        System.out.println("최고점은 " + max + "입니다.");
        System.out.println("최저점은 " + min + "입니다.");

    }
}
