package construct;

public class MemberThis {
    String nameField; // 인스턴스 변수 (필드)

    void initMember(String nameParameter) { // 메서드 매개변수 (지역변수)
        // nameField 는 지역 변수 (nameParameter) 에서 찾을 수 없으므로
        // 인스턴스 변수에서 찾게된다.
        // 이런 경우 this 를 생략해도 된다.
        nameField = nameParameter; // this.nameField = nameParameter; 와 동일함.
    }
}