package chapter05.lecture;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]); // 같은 객체 참조, true
        System.out.println(strArray[1] == strArray[2]); // 다른 객체 참조, false

        // 인덱스 1번과 인덱스 2번의 문자열 내용을 비교(주소값 비교 x)
        System.out.println(strArray[1].equals(strArray[2])); // 문자열 비교 결과, true
    }
}
