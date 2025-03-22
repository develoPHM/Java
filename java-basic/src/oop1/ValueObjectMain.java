package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        // 이제 데이터뿐만 아니라 메서드도 사용할 수 있다.
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종숫자=" + valueData.value);
    }
}