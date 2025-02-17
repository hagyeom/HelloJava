package chapter12.lecture;

class PrintThread1 extends Thread {
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("실행 중");
        }

        // stop이 true가 될 때
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printThread1 = new PrintThread1();
        printThread1.start();

        try {
            Thread.sleep(1000); // 메인 스레드 1초동안 일시 정지
        } catch (InterruptedException e) {
        }

        printThread1.setStop(true);
    }
}
