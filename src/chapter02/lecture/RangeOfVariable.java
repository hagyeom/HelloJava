package chapter02.lecture;

// 변수 사용 범위
public class RangeOfVariable {
    public static void main(String[] args) {
        // int 데이터 타입 : 정수형
        int value1 = 3;

        {
            int value2 = 5;
            System.out.println(value1);
            System.out.println(value2);
        }

        System.out.println(value1);
//        System.out.println(value2); // 오류 발생
    }
}
