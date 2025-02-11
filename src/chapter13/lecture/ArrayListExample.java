package chapter13.lecture;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); // String 객체를 저장

        list.add("Java"); // {Java}
        list.add("JDBC"); // {Java, JDBC}
        list.add("Servlet/JSP"); // {Java, JDBC, Servlet/JSP}
        list.add(2, "Database"); // {Java, JDBC, Database, Servlet/JSP}
        list.add("iBatis");

        int size = list.size(); // 저장된 총 객체 수 얻기
        System.out.println("총 객체 수: " + size);
        System.out.println();

        String oneOfSkill = list.get(2);
        System.out.println("2: " + oneOfSkill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        System.out.println();

        // {Java, JDBC, Database, Servlet/JSP, iBatis}
        list.remove(2); // {Java, JDBC, Servlet/JSP, iBatis}
        list.remove(2); // {Java, JDBC, iBatis}
        list.remove("2: " + oneOfSkill);
        list.remove("iBatis");

        // for 루프를 사용하지 않더라도 list의 toString()으로 가시화 가능
        System.out.println(list);
    }
}
