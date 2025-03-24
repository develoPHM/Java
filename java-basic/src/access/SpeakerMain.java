package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        
        speaker.volumeUp();
        speaker.showVolume();
        
        speaker.volumeUp();
        speaker.showVolume();
        
        // 필드에 직접 접근
        // Speaker 객체를 사용하는 사용자는 volume 필드와 메서드에 모두 접근할 수 있다.
        // 100 못넘게 해놨지만 소용이 없음.
        // 사용하는 입장에서는 volume 필드에 직접 접근해서 원하는 값을 설정할 수 있기 때문이다.
        // volume 필드는 외부 접근을 막을 수 있는 방법이 필요함
        System.out.println("volume 필드 직접 접근 수정");
        speaker.volume = 200;
        speaker.showVolume();
    }
}
