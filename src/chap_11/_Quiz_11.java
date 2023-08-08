package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 1;
        try {
            if (errorCode == 0) {
                System.out.println("상품 구매를 완료하였습니다");
            } else if (errorCode == 1) {
                throw new Error1 ("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new Error2 ("해당 상품은 매진되었습니다");
            }
        } catch (Error1 e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다");
        } catch (Error2 e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요");
        }
    }
}

class Error1 extends Exception {
    public Error1(String message) {
        super(message);
    }
}
class Error2 extends Exception {
    public Error2(String message) {
        super(message);
    }
}