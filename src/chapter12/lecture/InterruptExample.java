package chapter12.lecture;

class PrintThread2 extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("실행 중");

            // 인터럽트 발생 시 스레드 종료되도록 설계
            if (this.isInterrupted()) {
                break;
            }
        }
    }
}

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            // 지금 현재 메인 쓰레드가 1초동안 일시정지
            thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        thread.interrupt();
    }
}
