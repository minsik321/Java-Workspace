package chap_04;

import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20;   // 최대 치킨 판매 수량
        int sold = 0;   // 현재 치킨 판매 수량
        int noShow = 17;    // 대기번호 17번 손님이 노쇼
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;   // continue 를 사용시 아래의 조건을 실행하지 않고 다시 위의 조건으로 넘어감
            //    max += 1;
            }
            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 소진 되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("------------------------");

        // While 문
        sold = 0;
        int index  = 1; // 손님 번호
        while (index <= 50) {
        //현재 while 문 안에 조건인 index <= 50 의 값은 의미가 없기 때문에 그냥 true를 사용하여도 된다.

            // 아래의 두개의 index++ 을 없애려면 위의 index 값은 0으로 시작하고 범위는 <=49로 조정 한 후
            // 지금 위치에서 index++ 을 사용하면 아래 처럼 두개씩 사용하지 않아도 된다.
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                index++;    // 아래의 조건을 실행하지 않기 때문에 index++ 를 하나 더 넣어야 함.
                continue;
            }
            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 소진 되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
