package pack;

// import pack.a.User;
// import pack.a.User2;

import pack.a.*; // * 로 한번에 가져올 수 있다.

public class PackageMain2 {
    // 같은위치는 경로를 생략해도 됨.
    // 위치가 다른 패키지를 사용하기 위해선 전체 경로를 포함해서 클래스를 적어야함.
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
    }
}
