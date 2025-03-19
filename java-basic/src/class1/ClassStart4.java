package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student(); // x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        // students[0] = x001;
        // students[1] = x002;
        students[0] = student1;
        students[1] = student2;

        System.out.println(students[0].name + "은 " + students[0].age + "살 " + students[0].grade + "점");
        System.out.println(students[1].name + "은 " + students[1].age + "살 " + students[1].grade + "점");

    }
}
