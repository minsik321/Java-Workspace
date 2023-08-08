package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf("");

        System.out.println("------- 정수 -------");       // %d (decimal integer : 10 진 정수 형식)
        System.out.printf("%d%n", 1);  // %d = 정수 하나, \n = 줄바꿈, %n = 줄바꿈(어떤 OS 에서도 사용가능), 1
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1 2 3
        System.out.printf("%d%n", 1234); // 1234
        System.out.printf("%6d%n", 1234); // %6d = 6개의 공간을 확보하고 그 안에 1234 를 넣음, __1234
        System.out.printf("%06d%n", 1234); // %6d = 6개의 공간을 확보하고 그 안에 1234 를 넣고 빈공간에는 0을 넣음, 001234
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // %+6d = 뒤에 숫자가 양수 일 경우 양수 앞에 +를 붙힘 (항상 + - 기호 표시)
        System.out.printf("%,15d%n", 1000000000); // 세자리마다 ,로 끊어서 나타냄
        System.out.printf("%-6d%n", 1234); // %-6d = 6개의 공간을 확보한 후 왼쪽으로 정렬됨

        System.out.println("------- 실수 -------");       // %f (floating - point : 부동 소수점 형식)
        System.out.printf("%f%n", Math.PI); // 3.141592
        System.out.printf("%.2f%n", Math.PI); // 소수점 셋째자리에서 반올림 하여 둘째자리까지 나타냄, 3.14
        System.out.printf("%6.2f%n", Math.PI); // 6자리를 마련하고 소수점 둘째자리까지 나타냄, __3.14
        System.out.printf("%-6.2f%n", Math.PI); // 6자리를 마련하고 소수점 둘째자리까지 나타냄 (왼쪽 정렬), 3.14__
        System.out.printf("%06.2f%n", Math.PI); // 빈 공간에 0을 넣음, 003.14
        System.out.printf("%+6.2f%n", Math.PI); // 항상 + - 기호를 표시, _+3.14

        System.out.println("------- 문자열 -------");
        System.out.printf("%s%n", "Java"); // Java (일반 정렬)
        System.out.printf("%6s%n", "Java"); // __Java (6자리 공간 확보하고 우측 정렬)
        System.out.printf("%-6s%n", "Java"); // Java__ (6자리 공간 확보하고 좌측 정렬)
        System.out.printf("%6.2s%n", "Java"); // ____Ja (6자리 공간 확보하고 우측 정렬해서 2글자 출력)
        System.out.printf("%-6.2s%n", "Java"); // Ja____ (6자리 공간 확보하고 좌측 정렬해서 2글자 출력)

        System.out.println("------- 응용1 -------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0); // 강백호 90 80 85.0
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0); // 서태웅 100 100 100.0
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5); // 채치수 95 100 97.5

        System.out.println("------- 응용2 -------");
        System.out.println("이름       영어    수학    평균"); // 공백이 각각 6, 3, 3 칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95, 100, 97.5);

        System.out.println("------- 참고 -------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
    }
}
