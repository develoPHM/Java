package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);
        // student1.name = "학생1";
        // student1.age = 15;
        // student1.grade = 90;
        
        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);
        // student2.name = "학생2";
        // student2.age = 16;
        // student2.grade = 80;
        
        printStudent(student1);
        printStudent(student2);
    }
    
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    
    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적" + student.grade);
    }
}

// 참조형은 메서드를 호출할 때 참조값을 전달한다.
// 따라서 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거나, 값을 읽어서 사용할 수 있다.
