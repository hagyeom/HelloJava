package chapter11.lecture;

import java.io.IOException;

public class KeyBoardToStringExample {
    public static void main(String[] args) throws IOException {
        // 읽은 바이트를 저장하기 위한 배열 생성
        byte[] bytes = new byte[100];

        System.out.print("입력:");
        // 읽은 바이트를 배열에 저장하고 읽은 바이트 수를 리턴
        int readByteNumber = System.in.read(bytes);

        // -1을 추가하는 이유는 개행 문자도 추가되기 때문에 개수를 하나 빼줌
        String str = new String(bytes, 0, readByteNumber - 1);
        System.out.println(str);
    }
}
