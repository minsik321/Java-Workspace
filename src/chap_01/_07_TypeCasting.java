package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형으로  //정수형 변수 앞에 (float) 이나 (double) 을 붙혀서 실수형으로 변환
        // 실수형에서 정수형으로  //실수형 변수 앞에 (int) 을 붙혀서 정수형으로 변환 (실수 값에서 내림되어 나타냄)

        //int to float, double(정수형에서 실수형으로)
        int score = 93;
        System.out.println(score);  //93
        System.out.println((float) score);  //93.0
        System.out.println((double) score); //93.0

        //float, double to int(실수형에서 정수형으로)
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f);  //93
        System.out.println((int) score_d);  //98

        //정수 + 실수 연산
        score = 93 + (int)98.8;   //93 + 98
        System.out.println(score);  //191

        score_d = (double) 93 + 98.8; //93.0 + 98.8     (이미 실수형 변수이기 때문에 앞에선 (double)이 없어도 계산 됨
        System.out.println(score_d);    //191.8

        //변수의 형변환 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (점점 커지는 단위 - 자동 형 변환)

        int convertedScoreInt = (int) score_d;    // 191.8 -> 191
        // 큰 데이터 값을 작은 데이터의 범위로 나타내려하면 오류가 뜨기 때문에 변수 앞에 (int)-(작은 단위의 변수) 를 붙혀야 함
        // double -> float -> long -> int (작아지는 단위 - 수동 형 변환(변수 앞에 작은 단위))

        // 숫자를 문자열로                        //(String.valueOf()) 라는 class의 도움으로 숫자(정수)를 문자열로 사용
        String s1 = String.valueOf(93);
        // 정수를 문자열로
        s1 = Integer.toString(93);           //(Integer.toString()) 라는 class의 도움으로 정수를 문자열로 사용
        System.out.println(s1); // 93

        // 실수를 문자열로                        //(String.valueOf()) 라는 class의 도움으로 숫자(실수)를 문자열로 사용
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);         //(Double.toString()) 라는 class의 도움으로 실수를 문자열로 사용
        System.out.println(s2);

        // 문자열을 숫자로                        //문자열 ()괄호안에 숫자를 class 들의 도움으로 숫자로 나타냄
        int i = Integer.parseInt("93");
        System.out.println(i);  //93
        double d = Double.parseDouble("98.8");
        System.out.println(d);  //98.8

        // int error = Integer.parseInt("자바"); //숫자로 변환되어야 하는 변수 안에 문자에 있기 때문에 error 발생함
        // 각 class를 사용하여 형태를 변환 할 시에는 ""안에 올바른 데이터가 들어가 있어야 함
    }
}
