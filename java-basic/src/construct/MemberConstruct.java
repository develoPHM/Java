package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    // 생성자의 이름은 클래스 이름과 같아햐 한다. 따라서 첫 글자도 대문자로 시작함.
    // 생성자는 반환 타입이 없다. 비워두어야 함.
    // 나머지는 메서드와 동일.
    // 실수로 생성자 사용 안하면 컴파일 오류가 나기 때문에 필수값 입력을 보장할 수 있다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name =" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
