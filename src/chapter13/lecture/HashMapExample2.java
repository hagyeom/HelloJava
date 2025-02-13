package chapter13.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

class Student {
    private int sno;
    private String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Student)) return false;
        Student student = (Student) object; // 올바른 캐스팅
        return sno == student.sno && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1, "홍길동"), 80);
        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(2, "김철수"), 90);
        map.put(new Student(3, "김영희"), 100);

        map.remove(new Student(2, "김철수"));

        // 안전한 맵 수정 방법: 리스트를 사용하여 키 값을 저장한 후 수정
        List<Student> keys = new ArrayList<>(map.keySet());
        for (Student key : keys) {
            map.put(key, map.get(key) - 5);
        }

        System.out.println("총 Entry 수: " + map.size());
        System.out.println(map);
    }
}
