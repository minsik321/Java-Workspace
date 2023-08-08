package chap_07;

public class BlackBox {

    // static 이 포함된 변수는 클래스 변수이고 이 클래스로 만들어지게 된 모든 객체에 똑같이 적용됨.
    // static 이 포함되지 않는 변수는 인스턴스 변수

    // 모델명, 해상도, 가격, 색상
    String modelName;   // 모델명
    String resolution;  // 해상도
    int price; // 가격
    String color;    //색상
    int serialNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해서 값을 증가)
    static boolean canAutoReport = false;   // 자동 신고 기능

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    // showDataTime = 날짜 정보 표시여부
    // showSpeed = 속도 정보 표시여부
    // min = 영상 기록 단위(분)
    void record(boolean showDataTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDataTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록 됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
        // modelName = "test";  // 인스턴스 변수는 static 내에서 변경이 불가능 하지만
        // canAutoReport = false;  // 클래스 변수는 다른 static 내에서 변경 가능
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
        // 메소드 내에서 사용하는 인스턴스 변수와 파라미터 변수의 이름이 똑같다고 하면 this. 을 붙혀서 인스턴스 변수임을 나타냄
    }

    // Getter & Setter  // Getter (값을 가져오는 메소드), Setter (값을 설정하는 메소드)
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution () {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
