package chapter13.lecture;

import java.util.Stack;

class Browser {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public Browser() {
        this.backStack = new Stack<>();
        this.forwardStack = new Stack<>();
        this.currentPage = "";
    }

    // 페이지 방문 메서드
    public void visit(String page) {
        if (!currentPage.isEmpty()) {
            backStack.push(currentPage);
        }

        currentPage = page;
        // 새로운 페이지를 방문하면 앞으로 가기 스택은 비워짐
        forwardStack.clear();

        System.out.println("방문 : " + page);
    }

    // 뒤로 가기 메서드
    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage); // 현재 페이지를 앞으로 가기 스택에 저장
            currentPage = backStack.pop(); // 뒤로 가기 스택에서 페이지를 꺼내 현재 페이지로 설정
            System.out.println("뒤로 가기 : " + currentPage);
        } else {
            System.out.println("더이상 뒤로 갈 페이지가 없습니다.");
        }
    }

    // 앞으로 가기 메서드
    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage); // 현재 페이지를 뒤로 가기 스택에 저장
            currentPage = forwardStack.pop(); // 앞으로 가기 스택에서 페이지를 꺼내 현재 페이지로 설정
            System.out.println("뒤로 가기 : " + currentPage);
        } else {
            System.out.println("더이상 앞으로 갈 페이지가 없습니다.");
        }
    }
}

public class BrowserExample {
    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.visit("page1.com");
        browser.visit("page2.com");
        browser.visit("page3.com");
        // back : [page1.com, page2.com], forward : [], current : page3.com

        browser.back();
        // back : [page1.com], forward : [page2.com], current : page2.com
        browser.back();
        // back : [], forward : [page3.com, page2.com], current : page1.com
        browser.forward();
        // back : [page1.com], forward : [page3.com], current : page2.com

        browser.visit("page4.com");
        browser.back();
    }
}
