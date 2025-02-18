package chapter14.lecture;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:/temp/test7.txt");

        while (true) {
            int data = reader.read(); // 4byte 중에 1 byte만 씀

            if (data == -1)
                break;

            System.out.println((char) data);
        }
        reader.close();
    }
}
