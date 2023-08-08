package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Types) : int(0), float(0.0), double(0.0), long(0), boolean(false), ...
        // 배열로 선언을 하는데 값을 지정해주지 않으면 자동으로 지정되는 값이 있음. 메소드를 가지지 않음. 소문자로 시작.
        int[] i = new int[3];
        System.out.println(i[0]);

        double[] d = new double[3];
        System.out.println(d[0]);

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam, ...
        // 배열에서 값을 지정해 주지 않으면  null 로 표시됨. 메소드를 가질 수도 있음. 대문자로 시작.
        String[] s = new String[3];
        System.out.println(s[0]);   // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null);   // true

        System.out.println("-------------------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1;
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        // c2 = null;
        // System.out.println(c2.name); // 값이 없는것에 대한 메소드 이므로 error 가 발생함
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
