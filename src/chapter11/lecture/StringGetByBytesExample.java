package chapter11.lecture;


import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringGetByBytesExample {
    // 종종 문자열을 바이트 배열로 변환하는 경우가 있음
    // 예를 들어 네트워크로 문자열을 전송하거나, 문자열을 암호화 할 때
    // 윈도우 인코딩 : EUC-KR(window 949) 알파벳은 1바이트, 한글은 2바이트로 변환
    // UTF-8은 알파벳은 1바이트, 한글은 3바이트로 변환
    public static void main(String[] args) throws UnsupportedEncodingException, UnsupportedEncodingException {
        // 자바의 char 타입은 항상 UTF-16을 사용함, 즉 내부적으로 문자열 저장하고 다룰 때
        // 하지만 파일 입출력, 네트워크 전송, 문자열 -> 바이트로 변환할 때는 Charset이 필요하며
        // 이 때 기본적으로 Charset.defaultCharset()이 사용됨
        // Charset.defaultCharset()은 운영체제마다 다를 수 있음


        String str = "안녕하세요";

        // 기본 문자셋으로 인코딩과 디코딩 시작
        // 네트워크 전송자 시점
        byte[] byte1 = str.getBytes(); // UTF-8
        System.out.println("byte1.length = " + byte1.length);
        // 전송자의 기본 인코딩 : UTF-8
        System.out.println("Default Charset:" + Charset.defaultCharset().displayName());

        // 네트워크 수신자 시점
        String str1 = new String(byte1);
        System.out.println("byte1 -> String : " + str1);
        // 수신자의 기본 charset : UTF-8
        System.out.println("Defualt Charset:" + Charset.defaultCharset().displayName());

        // EUC-KR로 인코딩과 디코딩 시작
        // 네트워크 전송자 시점
        byte[] byte2 = str.getBytes("EUC-KR"); // EUC-KR로 인코딩된 바이트 배열 리턴
        System.out.println("byte2.length = " + byte2.length);

        // 네크워크 수신자 시점
        String str2 = new String(byte2, "EUC-KR"); // String 생성자로 byte2를 EUC-KR로 디코딩
        System.out.println("byte2->String(EUC-KR): " + str2);

        // UTF-8로 인코딩과 디코딩 시작
        // 네트워크 전송자 시점
        byte[] byte3 = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("byte3.length = " + byte3.length);

        // 네크워크 수신자 시점
        String str3 = new String(byte3, StandardCharsets.UTF_8);
        System.out.println("byte3->String(UTF-8): " + str3);
    }
}
