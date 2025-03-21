package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        
        // bigData.data 에서 null 이 생겨서 아래 실행 x nullpointexception
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
