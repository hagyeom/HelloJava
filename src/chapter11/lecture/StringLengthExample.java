package chapter11.lecture;

public class StringLengthExample {
    public static void main(String[] args) {
        // 주민등록번호 13자리
        String ssn = "7306241230123";
        int length = ssn.length(); // 총 13, 생년월일 6자리, 뒷 자리 7자리
        if (length == 13) {
            System.out.println("주민번호 자릿 수가 맞습니다.");
        } else {
            System.out.println("주민번호 자릿 수가 다릅니다.");
        }
    }
}
