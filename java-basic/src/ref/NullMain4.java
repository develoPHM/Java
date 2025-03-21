package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        
        // 참조 만들어 주었기 때문에 실행 간능
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
