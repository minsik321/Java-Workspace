package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형을 만들기
        /*

        *****
        *****
        *****
        *****
        *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        // 별 (*) 왼쪽 삼각형 만들기
        /*

        *
        **
        ***
        ****
        *****

         */
        for (int i = 0; i < 5; i++) {
            // for (int j = 0; j < i + 1; j++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 위의 fori 에 대한 조건문이 세로줄을 뜻하게 되고 아래의 fori 의 조건문은 가로를 뜻하게 된다
        // 세로줄의 경우에는 총 5줄을 나타내므로 i < 5 의 형태로 나타내면 된다.
        // 가로줄의 경우에는 하나씩 커지는 구조를 가지므로 위의 fori 의 변수 i 값이 1씩 커지는것을 이용하여
        // 조건문에 (j < i +1) 이거나 (j <= i) 를 만들게 되면 줄별로 하나씩 많아지는 *을 만들 수 있다.
        System.out.println("-------------------");

        // 별 (*) 오른쪽 삼각형 만들기
        /*

            *
           **
          ***
         ****
        *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //  두번째 fori { } 이후에 3번째 fori 의 반복문이 들어가야만 두번째의 fori 반복문을 모두 실행 한 후 세번째의 fori를 실행함
    }
}
