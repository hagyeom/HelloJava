package chapter08.lecture;

interface RemoteControl {
    public abstract void turnOn();

    public abstract void turnOff();
}

class Anonymous_ {
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio를 끕니다.");
            }
        };

        // 로컬 변수 사용
        localVar.turnOn();
    }

    void method2(RemoteControl rc) {
        rc.turnOn();
    }
}

public class Anonymous_Example {
    public static void main(String[] args) {
        Anonymous_ anony = new Anonymous_();

        // 익명 객체 필드 사용
        // tv를 켭니다
        anony.field.turnOn();

        // 익명 객체 로컬 변수 사용
        // 오디오
        anony.method1();

        // 익명 객체 매개값 사용
        // 스마트 tv
        anony.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("SmartTV를 끕니다.");
            }
        });
    }
}
