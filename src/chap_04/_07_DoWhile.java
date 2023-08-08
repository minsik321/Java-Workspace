package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println("---- 반복문 #1 ----");

        // 키가 엄청나게 큰 사람?
        move = 0;
        height = 2;
        while (move + height < distance) {  // 조건이 거짓이기 때문에 반복문을 실행하지 않음
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println("---- 반복문 #2 ----");

        // Do While 반복문 // 일단 Do 안에 명령문을 수행 한 후 while 의 조건을 확인 후 반복을 결정
        move = 0;
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리는 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");
    }
}
