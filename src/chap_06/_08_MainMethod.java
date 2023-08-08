package chap_06;

public class _08_MainMethod {
    // main 영역의 의미는 문자열 여러개인(args) String 배열을 전달값으로 받는 메소드 이다.

    // String 값을 전달 받는 방법
    // 오른쪽 위 current file 에서 Edit Configurations 에 들어가서 왼쪽 위에 + 에서 Application 선택
    // Application 이름 및 위치 설정 후 안에 전달값을 입력 시 main 영역안에 args 안에 들어가게 된다.
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if (args.length == 1) {
            switch (args[0]) {
                case "1" :
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2" :
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            System.out.println("사용법) 1~3 메뉴 중 하나를 입력하세요");
        }
    }
}
