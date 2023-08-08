package chap_08.detector;

public class FireDectector implements Detectable {
    @Override
    public void detect() {
        System.out.println("일반 성능으로 화재를 감지 합니다.");
    }
}
