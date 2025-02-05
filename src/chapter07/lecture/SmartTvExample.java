package chapter07.lecture;

import java.util.ArrayList;

public class SmartTvExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = (RemoteControl) tv; // 업캐스팅, 자동 형변환
        Searchable s = tv;

        // 다중 상속으로 인해 다수의 인터페이스 타입으로 형변환 가능
        RemoteControl smartTv1 = new SmartTelevision();
        Searchable smartTv2 = new SmartTelevision();


    }
}
