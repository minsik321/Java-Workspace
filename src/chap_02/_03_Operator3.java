package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3); // 5 는 3 보다 크다 (ture)
        System.out.println(5 >= 3); // 5 는 3 보다 크거나 같다 (true)
        System.out.println(5 >= 5); // 5 는 5 보다 크거나 같다 (ture)
        System.out.println(5 >= 7); // 5 는 7 보다 크거나 같다 (false)

        System.out.println(5 < 3); // 5 는 3 보다 작다 (false)
        System.out.println(5 <= 3); // 5 는 3 보다 작거나 같다 (false)

        System.out.println(5 == 5); // 5 는 5 와 같다 (true)  (=가 하나 일 경우에는 대입 연산이 되므로 비교 연산시 == 두개 사용)
        System.out.println(5 == 3); // 5 는 3 과 같다 (false)
        System.out.println(5 != 5); // 5 는 5 와 같지 않다 (false) (!= 같지 않다의 의미)
        System.out.println(5 != 3); // 5 는 3 과 같지 않다 (true)
    }
}
