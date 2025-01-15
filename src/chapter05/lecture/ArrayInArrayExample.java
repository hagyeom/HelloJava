package chapter05.lecture;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        System.out.println("----------- 표 형태로 출력 ------------");
        printIntArrayByTable(mathScores);

        System.out.println("\n----------- 한줄씩 출력 ------------");
        printIntArray(mathScores, "수학");

        int[][] englishScores = new int[2][];

        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        System.out.println();
        printIntArray(englishScores, "영어");

        int[][] javaScores = {{95, 80},
                {92, 96, 80}};

        System.out.println();
        printIntArray(javaScores, "자바");
    }

    public static void printIntArrayByTable(int[][] inputArray) {
        // 메서드 한계점 : 2 x 3만 출력 가능
        System.out.printf("%6s", "");
        System.out.printf("%6s", "mid");
        System.out.printf("%6s", "end");
        System.out.printf("%6s", "sum");

        System.out.println();

        System.out.printf("%6s", "stu0");
        System.out.printf("%6d", inputArray[0][0]);
        System.out.printf("%6d", inputArray[0][1]);
        System.out.printf("%6d", inputArray[0][2]);
        System.out.println();
        System.out.printf("%6s", "stu1");
        System.out.printf("%6d", inputArray[1][0]);
        System.out.printf("%6d", inputArray[1][1]);
        System.out.printf("%6d", inputArray[1][2]);
    }

    public static void printIntArray(int[][] intArray, String subject) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println(subject + "Scores[" + i + "][" + j + "]=" + intArray[i][j]);
            }
        }
    }
}
