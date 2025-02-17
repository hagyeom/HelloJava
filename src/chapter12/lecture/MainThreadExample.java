package chapter12.lecture;

class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    // 임계 영역, 단 하나의 스레드만 실행 가능
    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}

class User1 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User1"); // 스레드 이름을 User1로 설정
        this.calculator = calculator; // 공유 객체인 Calculator의 참조 주소값을 필드에 저장
    }

    public void run() {
        calculator.setMemory(100); // 공유 객체인 Calculator의 메모리에 100을 저장
    }
}

class User2 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User2"); // 스레드 이름을 User2로 설정
        this.calculator = calculator; // 공유 객체인 Calculator의 참조 주소값을 필드에 저장
    }

    public void run() {
        calculator.setMemory(50); // 공유 객체인 Calculator의 메모리에 50을 저장
    }
}

public class MainThreadExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1 user1 = new User1(); // User1 스레드 생성
        user1.setCalculator(calculator); // 공유 객체 설정
        user1.start(); // User1 스레드 시작

        User2 user2 = new User2(); // User2 스레드 생성
        user2.setCalculator(calculator); // 공유 객체 설정
        user2.start(); // User2 스레드 시작
    }
}
