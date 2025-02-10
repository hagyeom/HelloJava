package chapter11.lecture;

public class ByteToStringExample {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 111, 32, 74, 97, 118, 97};

        String str1 = new String(bytes);
        System.out.println(str1);

        String str2 = new String(bytes, 6, 4); // bytes의 인덱스 6부터 4개를 넘겨줌
        // Java만 출력
        System.out.println(str2);

    }
}
