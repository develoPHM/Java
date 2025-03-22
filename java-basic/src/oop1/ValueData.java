package oop1;

public class ValueData {
    int value;

    // 여기서 만드는 add() 메서드는 static 키워드를 사용하지 않는다.
    // 클래스는 속성과 기능을 정의할 수 있다
    // 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
    // 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.
    void add() {
        value++;
        System.out.println("숫자증가 value = " + value);
    }
}
