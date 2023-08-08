package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDectector;
import chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 상속 (extends) (단일 상속만 가능)
        // 인터페이스에서 만들어진 모든 메소드에는 기본적으로 앞에 public abstract 가 들어간다고 보면 됨
        // 인터페이스에서 변수를 만들게 된다면 기본적으로 앞에 public static final 이 붙게 됨
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("--------------------");

        Detectable fireDectector = new FireDectector();
        fireDectector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("--------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
