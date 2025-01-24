package chapter06;

public class HumanTester {
    public static void main(String[] args) {
        Human gildong = new Human("홍길동", 170, 60);
        Human chulsu = new Human("김철수", 166, 72);

        gildong.getWeight(3); // 홍길동이 3kg 쪘다. gainWeight에 파라미터 전달
        chulsu.reduceWeight(5); // 김철수가 5kg 빠졌다. reduceWeight에 파라미터 전달

        System.out.println("이름:" + gildong.getName());
        System.out.println("신장:" + gildong.getHeight() + "cm");
        System.out.println("체중:" + gildong.getWeight() + "kg");
        System.out.println();
        System.out.println("이름:" + chulsu.getName());
        System.out.println("신장:" + chulsu.getHeight() + "cm");
        System.out.println("체중:" + chulsu.getWeight() + "kg");
    }
}
