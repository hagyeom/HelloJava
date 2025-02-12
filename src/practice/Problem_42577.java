package practice;


import java.util.*;

public class Problem_42577 {

    //    class Solution {
//        public boolean solution(String[] phone_book) {
//            // 전화번호부를 정렬합니다.
//            Arrays.sort(phone_book);
//
//            // 인접한 번호들끼리 비교하여 접두어 관계를 확인합니다.
//            for (int i = 0; i < phone_book.length - 1; i++) {
//                if (phone_book[i + 1].startsWith(phone_book[i])) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
/*    class Solution {
        public boolean solution(String[] phoneBook) {
            // 1. HashMap을 선언한다.
            Map<String, Integer> map = new HashMap<>();

            // 2. 모든 전화번호를 HashMap에 넣는다.
            for (int i = 0; i < phoneBook.length; i++)
                map.put(phoneBook[i], i);

            // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
            for (int i = 0; i < phoneBook.length; i++)
                for (int j = 0; j < phoneBook[i].length(); j++)
                    if (map.containsKey(phoneBook[i].substring(0, j)))
                        return false;

            return true;
        }
    }*/
}
