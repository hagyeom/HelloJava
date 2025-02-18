package chapter14.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/temp/test2.db");

        byte[] buffer = new byte[2];

        while (true) {
            int readByteNum = is.read(buffer); // 배열 길이만큼 읽기, 리턴된 값은 100아 아닐 수 있음

            if (readByteNum == -1) // 파일 끝에 도달했을 경우
                break;

            for (int i = 0; i < readByteNum; i++) {
                System.out.println(buffer[i]);
            }
        }


        is.close();
    }
}
