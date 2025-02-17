package chapter12.lecture;

class Task implements Runnable {
    @Override
    public void run() {
        // 스레드가 실행할 코드
        System.out.println(Thread.currentThread().getName() + " : 쓰레드 실행!");
        System.out.println(Thread.currentThread().getName() + " : 쓰레드 종료!");
    }
}

public class TaskExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : 쓰레드 실행!");

        Runnable task = new Task();

        Thread thread1 = new Thread(task);
        thread1.start();

        // 익명 구현 객체 생성
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 실행 코드
                System.out.println(Thread.currentThread().getName() + " : 쓰레드 실행!");
                System.out.println(Thread.currentThread().getName() + " : 쓰레드 종료!");
            }
        });
        thread2.start();

        System.out.println(Thread.currentThread().getName() + " : 쓰레드 종료!");
    }
}
