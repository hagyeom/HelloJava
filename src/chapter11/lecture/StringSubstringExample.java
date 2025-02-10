package chapter11.lecture;

public class StringSubstringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        // String firstNum = subStr(ssn, 0, 6);
        String firstNum = subStr(ssn, 0, 6); // 0(포함) ~ 6(제외) 문자열 추출
        System.out.println(firstNum);

        // String secondNum = subStr(ssn, 7, ssn.length());
        // 파라미터 1개인 경우, 주어진 인덱스부터 끝까지 문자열을 추출
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }

    static String subStr(String src, int startIndex, int endIndex) {
        StringBuilder sb = new StringBuilder();

        for (int i = startIndex; i < endIndex; i++) {
            sb.append(src.charAt(i));
        }

        return sb.toString();
    }
}
