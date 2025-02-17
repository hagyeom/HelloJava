package chapter12.lecture;

import java.awt.*;

class BeepTask implements Runnable {
    @Override
    public void run() {
        System.out.println("BeepTask 시작");

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            System.out.println("비프음이 울립니다.");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }

        System.out.println("BeepTask 종료");
    }
}

public class BeepPrintExample2 {
    public static void main(String[] args) {
        System.out.println("메인 메소드 시작");

        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }


        System.out.println("메인 메소드 종료 ");
    }
}
