package class1;

//클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다. 둘다 같음
//여기서는 Student 클래스를 기반으로 student1, student2 객체 또는 인스턴스를 만들었다.
public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; // 변수 선언
        student1 = new Student(); // new 는 새로 생성한다는 뜻.
        // Student 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻.
        // 이렇게 하면 메모리에 실제 Student 객체(인스턴스)를 생성함.
        // 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값(주소)을 반환함.
        // 앞서 선언한 변수인 Student student1 에 생성된 객체의 참조값을 보관함.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // 객체 or 인스턴스
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1.name + "은 " + student1.age + "살 " + student1.grade + "점");
        System.out.println(student2.name + "은 " + student2.age + "살 " + student2.grade + "점");

    }
}

//int 라고 하면 정수 타입, String 이라고 하면 문자 타입이다.
//학생(Student) 이라는 타입을 만들면 되지 않을까?
//클래스를 사용하면, int, String 과 같은 타입을 직접 만들 수 있다.
//사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 설계도가 바로 클래스다.
//설계도인 클래스를 사용해서 *실제 메모리에 만들어진 실체를 *객체 또는 *인스턴스라고 한다.
//클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.

