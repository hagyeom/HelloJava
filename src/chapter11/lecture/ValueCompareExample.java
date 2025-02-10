package chapter11.lecture;

public class ValueCompareExample {
    public static void main(String[] args) {

        // 캐싱 영역
        // boolean : true, false
        // char : \u0000 ~ \u007f
        // byte, short, int 정수형 : -128 ~ 127
        System.out.println("[-128~127 초과값일 경우]");
        Integer obj1 = 300;
        Integer obj2 = 300;

        // 포장 객체에 어떤 값이 저장될 지 모르는 상황이라면
        // ==, != 연산자가 아닌 equals 메서드를 활용하는 것이 좋음
        System.out.println("== 결과: " + (obj1 == obj2));
        System.out.println("언박싱 후 == 결과: " + (obj1.intValue() == obj2.intValue()));
        System.out.println("equals() 결과: " + obj1.equals(obj2));
        System.out.println();

        System.out.println("[-128~127 범위값일 경우]");
        Integer obj3 = 10;
        Integer obj4 = 10;

        // 포장 객체에 어떤 값이 저장될 지 모르는 상황이라면
        // ==, != 연산자가 아닌 equals 메서드를 활용하는 것이 좋음
        System.out.println("== 결과: " + (obj3 == obj4));
        System.out.println("언박싱 후 == 결과: " + (obj3.intValue() == obj4.intValue()));
        System.out.println("equals() 결과: " + obj3.equals(obj4));
        System.out.println();
    }
}
