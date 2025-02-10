package chapter11.lecture;

public class TimeExample {
    public static void main(String[] args) {
        // 현재 시간을 밀리세컨드 단위로 받아옴
        long startTime = System.currentTimeMillis();
        // 나노세컨드 단위로 받아옴
        // long nanoTime = System.nanoTime();

        for (int i = 0; i < 2_000_000; i++) {
            System.out.println(1);
        }

        long endTime = System.currentTimeMillis();

        double elapsedTime = (endTime - startTime) / 1000;
        System.out.println("총 수행 시간: " + elapsedTime + "초");
    }
}
