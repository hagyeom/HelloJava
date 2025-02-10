package chapter11.lecture;

public class StringToLowerUpperCaseExample {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "JAVA Programming";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        // 새로 생성된 소문자 문자열 참조
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();

        System.out.println(lowerStr1.equals(lowerStr2));
    }
}
