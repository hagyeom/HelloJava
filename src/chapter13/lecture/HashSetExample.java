package chapter13.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return member.name.equals(name) && (member.age == age);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() { // name과 age 값이 같으면 동일한 hashCode를 리턴
        return name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();

        set1.add("Java");
        set1.add("JDBC");
        set1.add("Servlet/JSP");
        set1.add("Java"); // 중복 데이터
        set1.add("iBatis");

        int size = set1.size();
        System.out.println("총 객체 수: " + size);

        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set1.remove("JDBC");
        set1.remove("iBATIS");

        for (String element : set1) {
            System.out.println("\t" + element);
        }

        set1.clear();

        System.out.println(set1);

        if (set1.isEmpty()) {
            System.out.println("비어있음");
        }

        Set<Member> set2 = new HashSet<Member>();

        set2.add(new Member("홍길동", 30));
        set2.add(new Member("홍길동", 30));
        // 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장

        System.out.println(set2);
        System.out.println("총 객체수 : " + set2.size());
    }
}