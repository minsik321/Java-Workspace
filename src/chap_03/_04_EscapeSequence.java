package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수 문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : tab (결과에 tab 을 한 것과 같은 결과)
        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // \\ : "\" 하나의 의미 (\ 이후 글자를 통해 특수 문자의 기능을 하기 때문)
        System.out.println("C:\\Program Files\\Java");

        // \" : 큰 따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' : 작은 따옴표
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        // 문장안에서는 '를 바로 사용하여도 되지만 char 에서는 '를 사용하여 문장을 나타내므로 \' 를 사용하여야 한다
        char c = 'A';
        c = '\'';
        System.out.println(c);
    }}
