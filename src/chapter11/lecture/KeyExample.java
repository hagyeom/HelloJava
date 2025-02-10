package chapter11.lecture;

import java.util.HashMap;

class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key key)) return false;

        return number == key.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}

public class KeyExample {
    public static void main(String[] args) {
        // Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        // 식별키 new Key(1)로 "홍길동"을 저장함
        // 사전이라고 생각하면 편함. (단어 - 뜻 / 키 - 밸류) 
        Key key1 = new Key(1);
        // 해시(Hash)는 입력 데이터를 고정된 길이의 데이터로 변환된 값
        // 해시는 저장 또는 검색에서 자주 활용되는 자료구조. 보통 Hash값은 정수 형태
        System.out.println("key1.hashCode() = " + key1.hashCode());
        hashMap.put(key1, "소설 '홍길동전'의 주인공이자 초능력을 부리는 인물");

        // 식별 키 new Key(1)로 "홍길동"을 읽어옴
        Key key2 = new Key(1);
        System.out.println("key2.hashCode() = " + key2.hashCode());

        String value = hashMap.get(key2);
        System.out.println(value);

        // String은 hashMap이 어떻게 되어 있을까?
        HashMap<String, String> hashMap1 = new HashMap<>();

        hashMap1.put("심청이", "심청전에 나오는 주인공");
        hashMap1.put("임꺽정", "드라마 임꺽정에 나오는 주인공");

        System.out.println(hashMap1.get("심청이"));
        System.out.println(hashMap1.get("임꺽정"));
    }
}
