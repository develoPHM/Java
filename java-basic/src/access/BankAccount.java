package access;

public class BankAccount {
    
    // balance 변수를 private 로 설정하여 외부에서 직접 접근할 수 없도록 보호함
    private int balance;
    
    public BankAccount() {
        balance = 0;
    
    }
    
    // balance 를 직접 수정할 수 없지만,
    // deposit(), withdraw(), getBalance() 메서드를 통해 제어된 방식으로만 변경 가능함.
    // 캡슐화의 핵심은 데이터를 숨기고, 필요한 메서드만 공개하는 것.
    public void deposit(int amount) { // public 메서드 deposit
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }
    
    public void withdraw(int amount) { // public 메서드 withdraw
        if (isAmountValid(amount) && balance - amount > 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }
    
    public int getBalance() { // public 메서드 getBalance
        return balance;
    }
    
    // 클래스 내부에서만 사용되는 검증 로직이므로 private 를 선언.
    // 이렇게 하면 외부에서 불필요한 접근을 막아, 클래스의 책임을 명확히 구분할 수 있다.
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
    
}


