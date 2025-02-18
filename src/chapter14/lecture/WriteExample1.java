package chapter14.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:/temp/test1.txt");

        byte a = 10;
        byte b = 20;
        byte c = 30;

        // write(int b) 메서드
        os.write(a); // 내부 버퍼(저장소)에 우선 저장
        os.write(b);
        os.write(c);

        os.flush(); // flush() 메서드는 내부 버퍼에 잔류된 바이트를 모두 출력
        os.close(); // 더 이상 사용하지 않을 때 close() 메서드 호출
    }
}
