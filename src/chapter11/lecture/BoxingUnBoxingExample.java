package chapter11.lecture;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // 박싱
        // new Integer(int) 및 new Integer(String)은
        // Java 9에서 비추천(Deprecated), Java 11에서 삭제
        // Integer obj1 = new Integer(100); // 컴파일 에러 발생
        // Integer obj2 = new Integer("200"); // 컴파일 에러 발생
        // 최근 Java 버전에서는 valueOf()가 캐싱을 활용하므로 더 효율적임
        Integer obj1 = Integer.valueOf(100);
        Integer obj2 = Integer.valueOf("200");
        Integer obj3 = Integer.valueOf("300"); // 캐싱 가능

        // 언박싱
        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
