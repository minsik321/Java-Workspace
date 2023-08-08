package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1 등 : 전액 장학금
        // 2 등 : 반액 장학금
        // 3 등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용 (여러 조건 또는 범위에 해당하는 조건)
        int ranking =4; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        }
        // else if (ranking == 2 || ranking == 3)   // 2등과 3등 모두 반액 장학금 이므로 이렇게도 사용 가능 하다
        else if (ranking == 2) {
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우)
        ranking = 4;
        switch (ranking) {      // Case 내의 범위를 확인하고 일치 할 경우 그 문장을 실행하고 break를 만나 case를 빠져나옴
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // Case 2 와 3 을 통합
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 증고 상품의 등급에 따른 가격을 책정 (1등 : 최상, 4급 : 최하)
        int grade = 2; // 등급
        int price = 7000; // 기본 가격
        switch (grade) {
            case 1:
                price += 1000;  // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품의 가격은 10000원
        // 2등급 제품의 가격은 9000원 ...
    }
}
