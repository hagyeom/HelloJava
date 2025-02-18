package chapter14.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:/temp/test3.db");

        byte[] array = {10, 20, 30, 40, 50};

        os.write(array, 1, 3); // 1번 인덱스부터 3개를 출력

        os.flush();
        os.close();
    }
}
