package method;

public class Method1 {
    // public static
    // public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻.
    // static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻.
    public static void main(String[] args) {
        // 계산 1
        int sum1 = add(5, 10);
        System.out.println(sum1);
        System.out.println("===========");

        // 계산 2
        int sum2 = add(15, 20);
        System.out.println(sum2);
    }

    // int add(int a, int b)
    // int : 반환 타입을 정의함.
    // add : 메서드 이름
    // int a, int b : 메서드를 호출할 때 전달하는 입력 값을 정의함. 타입은 int
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + "연산수행");
        int sum = a + b;
        return sum;
    }


}
