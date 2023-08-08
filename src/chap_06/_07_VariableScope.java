package chap_06;

public class _07_VariableScope {
    public static  void methodA() {
        // System.out.println(number);
        // System.out.println(result);
    }

    public static  void methodB() {
        int result = 1; // 지역 변수 ( 변수가 선언된 그 영역 내에서만 사용 가능 . 따라서 중괄호(메소드, 메인) 내에서 사용 불가 )
    }

    public static void main(String[] args) {
        int number = 3;

        // System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i);  // fori 문 안에서의 i 는 fori 문 안에서만 사용 가능하고 그 외에서는 사용 불가

        // { int j = 0;}
        // System.out.println(j);
    }
}
