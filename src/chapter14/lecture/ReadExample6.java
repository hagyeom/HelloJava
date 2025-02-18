package chapter14.lecture;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample6 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:/temp/test9.txt");

        char[] buffer = new char[5];

        int readCharNum = reader.read(buffer, 2, 3);

        if (readCharNum != -1) {
            for (int i = 0; i < buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }

        reader.close();
    }
}
