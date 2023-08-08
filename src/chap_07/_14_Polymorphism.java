package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a Person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a Person)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("------------------");

        // SpeedCam speedCam = new SpeedCam(); 과 같이 생성된 객체도 cameras 배열로 관리는 할 수 있다.
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("----------------");

        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // speedCam.recongnizedLicensePlate();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        // 기본적으로 JAVA 에서는 Object 라는 클래스를 상속하고 있고 그렇기 때문에 아래처럼 Object 배열을 사용 할 경우
        // 어떤 형태 이던간에 모든 클래스 객체를 집어 넣을 수 있어서 한꺼번에 관리하기 용이하다
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();

    }
}
