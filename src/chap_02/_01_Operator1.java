package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);  // 6
        System.out.println(4 - 2);  // 2
        System.out.println(4 * 2);  // 8
        System.out.println(4 / 2);  // 2
        System.out.println(5 / 2);  // 2.5 (정수 연산이기에 뒤에 소수점은 버려지고 2 만 남게 된다.)
        System.out.println(2 / 4);  // 0.5 (정수 연산이라 0이 남음)
        System.out.println(4 % 2);  // 0 (나머지를 구하는 연산)
        System.out.println(5 % 2);  // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);  // 6
        System.out.println((2 + 2) * 2);    //8
        System.out.println(2 + (2 * 2));    //6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);  // 30

        c = a - b;
        System.out.println(c);  // 10

        c = a * b;
        System.out.println(c);  // 200

        c = a / b;
        System.out.println(c);  // 2

        c = a % b;
        System.out.println(c);  // 0

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);    //10
        System.out.println(++val);  //11    (변수 앞에 ++이 들어가면 변수에 1일 먼저 더한 다음에 변수의 연산을 함)
        System.out.println(val);    //11    (그렇기에 이후 계산에도 11이 나옴)

        val = 10;
        System.out.println(val);    //10
        System.out.println(val++);  //10    (변수 뒤에 ++이 붙으면 문장을 실행 후 이후에 1을 더함-이번 결과값은 더하지 않음)
        System.out.println(val);    //11    (이전 문장 계산 이후 1일 더해졌기에 이번 문장에서 +1이 된 11이라는 값이 나옴)

        val = 10;
        System.out.println(val);    //10
        System.out.println(--val);  //9     (변수 앞에 --가 들어가면 변수에 1일 뺀 다음에 변수에 연산을 함)
        System.out.println(val);    //9

        val = 10;
        System.out.println(val);    //10    (변수 뒤에 --이 붙으면 문장을 실행 후 이후에 1을 뺌-이번 결과값은 빼지 않음)
        System.out.println(val--);  //10    (이전 문장 계산 이후에 1일 빼졌기에 이번 문장에서 -1이 된 9라는 값이 나옴)
        System.out.println(val);    //9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);     // 대기 인원 : 0 (다음 연산에 1을 더함)
        System.out.println("대기 인원 : " + waiting++);     // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++);     // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting);     // 대기 인원 : 3

    }
}
