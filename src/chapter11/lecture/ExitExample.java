package chapter11.lecture;

public class ExitExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                System.exit(0);
                break;
            }
        }

        // break 실행 되었다면 출력될 것임
        System.out.println("프로그램 종료");
    }
}
