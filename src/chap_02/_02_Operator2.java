package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        num = num + 2;
        System.out.println(num); // 12

        num = num - 2;
        System.out.println(num); //10

        num = num * 2;
        System.out.println(num); //20

        num = num / 2;
        System.out.println(num); //10

        num = num % 2;                          // %는 나머지를 나타내는 연산자
        System.out.println(num); //0

        // 복합 대입 연산자
        num = 10;
        //num = num + 2;
        num += 2;       //위의 문장과 같은 역할을 함
        System.out.println(num); // 12

        // num = num - 2;
        num -= 2;
        System.out.println(num); // 10

        // num = num * 2;
        num *= 2;
        System.out.println(num); // 20

        // num = num / 2;
        num /= 2;
        System.out.println(num); // 10

        // num = num % 2;
        num %= 2;
        System.out.println(num); // 0
    }
}
