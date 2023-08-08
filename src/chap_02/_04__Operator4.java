package chap_02;

public class _04__Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음);       // 하나라도 true 이면 true (||는 or 의 의미)
        System.out.println(김치찌개 && 계란말이 && 제육볶음);       // 모두 true 이면 true (&&는 and 의 의미)

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // 5 는 3 보다 크고, 3 은 1 보다 크다(true)
        System.out.println((5 > 3) && (3 < 1)); // 5 는 3 보다 크고, 3 은 1 보다 작다(false)

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5 는 3 보다 크거나, 3 은 1 보다 크다(true)
        System.out.println((5 > 3) || (3 < 1)); // 5 는 3 보다 크거나, 3 은 1 보다 작다(true)
        System.out.println((5 < 3) || (3 < 1)); // 5 는 3 보다 작거나, 3 은 1 보다 작다(false)

        //System.out.println(1 < 3 < 5);  //이와 같이 연속적인 비교는 불가능 하다.
        //(1 < 3 && 3 < 5)로 표기하면 가능함. 중간에 괄호가 없어도 무관하나 가독성을 위해 ((1 < 3) && (3 < 5))로 표시한다.

        //논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false (5 는 5 와 같다의 반대)
        System.out.println(!(5 == 3)); // true
    }
}
