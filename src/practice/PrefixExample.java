package practice;

import java.util.Arrays;
import java.util.HashMap;

// Prefix : 접두사
public class PrefixExample {
    public static void main(String[] args) {
        // m이나 p로 시작하는 단어의 부적어 앞에는 im-을 붙임
        // possible 가능한 <-> impossible 불가능한
        // moral 도덕상의 <-> immoral 부도덕한
        // prefix : 접두사, src : 포함 여부 확인할 대상
        String[] test = {"1243", "123", "12"};

        // 3 * 3 * 4 = 36번의 연산이 필요할 수도 있음
        boolean result = solution(test);

        // 4 * 2 + 3 * 4 = 20번의 연산이 필요할 수도 있음
        boolean result2 = solution2(test);

        // 3 + 3 * 4 = 15번의 연산이 필요할 수 있음
        boolean result3 = solution3(test);

    }

    public static boolean solution(String[] phone_book) { // O(N*N*M)
        for (int i = 0; i < phone_book.length - 1; i++) { // O(N), N은 데이터 개수
            for (int j = i + 1; j < phone_book.length; j++) { // O(N), N은 데이터 개수
                if (phone_book[i].startsWith(phone_book[j]) || phone_book[j].startsWith(phone_book[i])) { // O(M), M은 데이터 개수
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solution2(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;
        }

        return true;
    }

    public static boolean startsWith(String prefix, String src) { // 2. 시간 복잡도. 빅오 표기범 : O(M), M은 prefix.length
        if (prefix.length() > src.length()) {
            return false;
        }

        int i;

        for (i = 0; i < prefix.length(); i++) {
            if (src.charAt(i) != prefix.charAt(i)) {
                break;
            }
        }

        return i == prefix.length() ? true : false;
    }

    public static boolean solution3(String[] phone_book) {
        HashMap<String, Boolean> map = new HashMap<>();

        for (String number : phone_book) // O(n)
            map.put(number, true);

        for (String number : phone_book) // O(n)
            for (int i = 1; i < number.length(); i++) // O(m)
                if (map.containsKey(number.substring(0, i))) // O(1)
                    return false;

        return true;
    }
}
