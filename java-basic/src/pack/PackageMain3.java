package pack;

import pack.a.User;

public class PackageMain3 {
    // 같은위치는 경로를 생략해도 됨.
    // 위치가 다른 패키지를 사용하기 위해선 전체 경로를 포함해서 클래스를 적어야함.
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
