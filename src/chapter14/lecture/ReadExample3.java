package chapter14.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample3 {
    public static void main(String[] args) throws IOException {
        // test3.db 파일을 읽어서 화면에 출력
        // read(buffer, 2, 3);

        InputStream is = new FileInputStream("C:/temp/test3.db");

        byte[] buffer = new byte[5];

        // read(buffer, 2, 3);
        // buffer의 2번 인덱스부터 저장하되 3개 저장
        int readByteNum = is.read(buffer, 2, 3);

        if (readByteNum != -1) {
            for (int i = 0; i < buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }
        
        is.close();
    }
}
