package practice;

public class Problem_04_3 {
    public static void main(String[] args) {
        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1; // 눈 1
            int dice2 = (int) (Math.random() * 6) + 1; // 눈 2
            System.out.println("(" + dice1 + ", " + dice2 + ")");
            if (dice1 + dice2 == 5) {
                System.out.println("두 눈의 합이 5가 되어 종료합니다.");
                break;
            }
        }
    }
}
