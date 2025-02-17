package chapter12.lecture;

import java.awt.*;

class BeepThread extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            System.out.println("익명");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println("익명 작업 종료 ");
        }
    }
}

public class BeepPrintExample4 {
    public static void main(String[] args) {
        // 익명 객체로 변경
        // Thread thread = new BeepThread();
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    System.out.println("익명");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                    System.out.println("익명 작업 종료 ");
                }
            }
        };

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
