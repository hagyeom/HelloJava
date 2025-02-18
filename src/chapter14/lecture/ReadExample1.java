package chapter14.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {
    public static void main(String[] args) throws IOException {
        // try-with-resource, finally를 작성하지 않아도 자동으로 닫아줌
        try (InputStream is = new FileInputStream("C:/temp/test1.txt")) {

            while (true) {
                int data = is.read();

                if (data == -1) {
                    break;
                }
                
                System.out.println(data);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}
