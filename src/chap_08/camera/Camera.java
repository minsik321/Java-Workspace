package chap_08.camera;

public abstract class Camera {
    public void takePicture() {     // 사진 촬영
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {      // 동영상 녹화
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature();     // 구현해야 하는 메소드
}
