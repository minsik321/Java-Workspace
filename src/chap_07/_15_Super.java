package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super (부모 클래스에서의 어떤 동작을 수행하고 나서 자식 클래스에서의 추가적인 동작을 함
        // Override 로도 만들 수 있지만 그럴경우 동작을 수정시 부모 & 자식 클래스 모두 수정해야하고 부모 클래스 사용 의미가 사라짐)
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("------------");
        speedCam.takePicture();
    }
}
