package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 ( 에러 error(작성하는 소스 코드를 사용하여 수습 불가), 예외 exception(수습가능) )
        // 런타임 오류를 만나게 될 경우 프로그램을 끝까지 실행되지 못하고 바로 종료됨
//        int i = "문자열"; - 컴파일 오류
//        int[] arr = new int[3];  - 런타임 오류
//        arr[5] = 100;
//        S s = null;
//        s.methodA();        // NullPointerException

        try {
//            System.out.println(3 / 0);

//            int[] arr = new int[3];
//            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int) obj);

        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }


        System.out.println("프로그램 정상 종료");

    }
}

//class S {
//    public void methodA() {     // StackOverflowError
//        this.methodA();
//    }
//}