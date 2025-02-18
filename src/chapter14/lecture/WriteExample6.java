package chapter14.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample6 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/temp/test9.txt");

        char[] array = {'A', 'B', 'C', 'D', 'E'};

        writer.write(array, 1, 3); // 배열로 전달, offset 1번 위치부터 3개를 작성 = BCD

        writer.flush();
        // FileWriter는 기본적으로 시스템의 기본 문자 인코딩을 사용
        // 즉, 운영체제에 따라 다름. 윈도우에서 EUC-KR, mac OS에서는 UTF-8
        writer.close();
    }
}
