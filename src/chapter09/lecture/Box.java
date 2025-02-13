package chapter09.lecture;

import java.util.ArrayList;
import java.util.List;

// Box<T>에서 T를 타입 변수(type variable)라고 함. T는 Type의 첫 글자에서 따옴
// ArrayList<E>의 경우 Element(요소)의 첫 글자를 따서 E라고 되어있음
// Map<K, V> 같이 타입 변수가 여러 개인 경우 ,로 구분해주면 됨. K는 key, V는 value를 의미
// 타입 변수명 같은 경우에는 가능하면 상황에 맞는 의미있는 문자를 선택하면 됨
// 타입 변수는 '임의의 참조형 타입'을 의미, 외부에서 선언할 때 원하는 타입을 지정할 수 있음
public class Box<T> {
    List<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

}