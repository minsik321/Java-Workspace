package chap_04;
// 주차 요금은 20000 원 입니다.

public class _Quiz_04 {
    public static void main(String[] args) {
//        int hour = 5; // 주차시간
//        int max = 30000; // 최대 금액
//        int i = hour * 4000; // 금액
//        boolean inSmallCar = false; // 경차 여부
//        boolean withDisabledPerson = false; // 장애인 차량 여부
//        if (!inSmallCar && !withDisabledPerson) {
//            if (i <= max) {
//                System.out.println("주차 요금은 " + i + " 원 입니다.");
//            } else if (i > max) {
//                System.out.println("주차 요금은 " + max + " 원 입니다.");
//            }
//        } else if (inSmallCar || withDisabledPerson) {
//            if (i <= max) {
//                i /= 2;
//                System.out.println("주차 요금은 " + i + " 원 입니다.");
//            } else if (i > max) {
//                System.out.println("주차 요금은 " + max / 2 + " 원 입니다.");
//            }
//        }
        int hour1 = 5; // 주차시간
        boolean inSmallCar1 = false; // 경차 여부
        boolean withDisabledPerson1 = false; // 장애인 차량 여부

        int fee = hour1 * 4000; // 주차 정산 요금 (시간당 4000 원 곱하기)

        // 30000 원 초과 시 일일 최대 요금으로 수령
        if (fee > 30000) {
            fee = 30000;    // 일일 최대 요금 적용
        }

        //경차 또는 장애인 차량인 경우 50% 할인
        if (inSmallCar1 || withDisabledPerson1) {
            fee /= 2; // fee = (int)(fee * 0.5f); 이거나 fee *= 0.5f; 도 사용가능
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + " 원 입니다.");
    }
}
