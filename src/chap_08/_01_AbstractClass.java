package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction) - 데이터를 숨기기 위해서
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스) - 따라서 객체를 생성 할 수 없음, 상속 받은 자식 클래스는 생성 가능.
        // 추상 메소드 (추상 클래스 또는 인터페이스에서 사용 가능함, 껍데기만 있는 메소드)
        // 추상 메소드가 부모 클래스에 있을 시 자식 클래스에서는 반드시 추상 클래스를 구현을 해야 함

        // Camera camera = new Camera(); (추상 클래스이기 때문에 객체를 만들지 못함)
        FactoryCam factoryCam = new FactoryCam();
        // Camera factoryCam = new FactoryCam(); // 추상 클래스로써 객체를 만들지는 못하지만 부모 클래스로써는 생성 가능
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
