package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식 (접근 제어자(예 : public), 메소드명, 반환명 들이 필요 없음)
        // (전달값1, 전달값2, ...) -> { 코드 }
    }

//    public void print() {
//        String s = "test";
//        System.out.println(s);
//    }

//    () -> {                       접근제어자, 메소드명, 반환명 들이 생략 가능
//        String s = "test";
//        System.out.println(s);
//    }

//    public void print(String s) {
//        System.out.println(s);
//    }

//    s -> System.out.println(s)    1문장일 경우 {} 삭제 가능,;도 생략 가능, s 값이 String 이라는것도 알 수 있기 때문에 생략 가능

//    public int add(int x, int y) {
//        return x + y;
//    }

//     ( x, y) -> { return x + y; }   1문장일 경우에도 return 이 포함 될 경우에는 {} 생략 불가능
//     ( x, y) -> x + y               Lambda 식의 경우 return 이 생략 되어도 자동으로 반환 됨

}
