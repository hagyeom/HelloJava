package chapter12.lecture;

import java.awt.*;

// 쓰레드의 3가지 상태 : 실행 대기, 실행, 일시 정지
// 실행 대기 상태 : 실행을 기다리고 있는 상태이며, start() 메소드를 호출하면
// 곧바로 실행되는 것처럼 보이지만 사실은 실행 대기 상태가 됨
// 실행 상태 : 운영체제가 하나의 스레드를 선택하고 CPU(코어)가 run() 메소드를 실행하도록 함
// 실행 상태의 스레드는 run() 메서드를 모두 실행하기 전에 다시 실행 대기 상태로 돌아갈 수 있음
// 그리고 실행 대기 상태에 있는 다른 쓰레드가 선택되어 실행 상태가 됨
// 이렇게 쓰레드는 실행 대기 상태와 실행 상태를 번갈아 가면서 자신의 run() 메서드를 조금씩 실행
// 종료 상태 : 실행 상태에서 run() 메서드가 종료되면, 더이상 실행될 코드가 없기 때문에 실행이 멈춤
// 일시 정지 상태 : 스레드가 실행할 수 없는 상태
// 실행 대기와 실행 상태를 번갈아가면서 경우에 따라서는 일시 정지 상태로 가기도 함
// 일시 정지 상태에서는 바로 실행 상태로 돌아갈 수 없고
// 일시 정지 상태에서 빠져나와 대기 상태로 가야함
public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                // 메인 스레드를 3초도안 일시정지 상태로 보내고
                Thread.sleep(3000);
                // 3초가 지나면 다시 실행 준비 상태로 돌아옴
            } catch (InterruptedException e) {
            }
        }
    }
}
