package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);
        // 생성자를 오버로딩 한 덕분에 성적 입력이 꼭 필요한 경웨어는 grade 가 있는 생성자를 호출하면 되고,
        // 그렇지 않은 경우에는 grade 가 없는 생성자를 호출하면 된다.

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
