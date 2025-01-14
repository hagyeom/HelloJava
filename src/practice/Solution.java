package practice;

class Solution {
    public int solution(String str1, String str2) {
        return contains(str1, str2) ? 1 : 0;
    }

    private boolean contains(String subStr, String fullStr) {
        // 'fullStr'에서 'subStr'의 시작 위치를 찾기 위해 반복문을 실행.
        // 'fullStr.length() - subStr.length()'는 검색 범위를 제한하여
        // 'subStr'가 'fullStr'을 초과하지 않도록 방지
        for (int i = 0; i <= fullStr.length() - subStr.length(); i++) {
            // 현재 위치('i')의 문자와 'subStr'의 첫 번째 문자가 일치하는지 확인
            if (fullStr.charAt(i) == subStr.charAt(0)) {
                // 'subStr'의 나머지 문자들도 일치하는지 확인하기 위한 내부 반복문
                int j;
                for (j = 1; j < subStr.length(); j++) {
                    // 'subStr'의 문자와 'fullStr'의 대응하는 문자가 일치하지 않으면 중단
                    if (fullStr.charAt(i + j) != subStr.charAt(j)) {
                        break; // 내부 반복문을 종료하고 다음 위치에서 검색을 계속
                    }
                }
                // 'subStr'의 모든 문자가 일치했는지 확인
                if (j == subStr.length()) {
                    return true; // 일치하는 부분 문자열을 찾았으므로 true 반환
                }
            }
        }
        // 반복문이 끝날 때까지 일치하는 부분 문자열을 찾지 못하면 false 반환.
        return false;
    }
}

