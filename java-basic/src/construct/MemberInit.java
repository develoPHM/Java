package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        // this 를 쓰면 인스턴스의 값을 참조한다.
        // 위의 class 에서 가져옴.
        // 멤버 변수에 접근하기 위해 this 를 사용.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
