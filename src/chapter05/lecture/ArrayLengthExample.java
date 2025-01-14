package chapter05.lecture;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30};

        int sum = 0;

        // sum을 누적해서 총합 계산 (length를 for문에 사용)
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        
        System.out.println("총합 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
