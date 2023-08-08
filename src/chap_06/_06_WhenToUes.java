package chap_06;

public class _06_WhenToUes {
    public static int getPower(int number) {
        return getPower(number,2);
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // - 여러번 반복 되는 경우에 중복을 줄이기 위해
        // - 코드에 대한 유지 보수를 할 때에 간편하다

        // 2 의 2 승을 구하기
        System.out.println(getPower(2,2)); // 2 * 2 = 4

        // 3 의 3 승을 구하기
        System.out.println(getPower(3,3)); // 3 * 3 * 3 =27

        // 4 의 2승을 구하기
        System.out.println(getPower(4,2)); // 4 * 4 = 16
    }
}
