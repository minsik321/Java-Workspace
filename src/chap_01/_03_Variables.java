package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;                        //문자열 변수
        name = "민식";                       //프로그램상의 등호는 오른쪽의 값을 왼쪽의 변수(또는 객체)에 집어넣는다는 의미.
        //String name = "민식";              //같은 줄에도 변수 선언 가능.(위의 두 줄과 같은 역할을 함)
        int hour = 13;                      //정수형 변수


        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;                //실수값 변수(정밀한 수에 적합)
        char grade = 'A';                   //한글자 문자 변수(''사용)
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;                //boolean 에서 true & false 작성시 "" 사용 안함
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;           //double 에 비해 정밀도는 떨어지지만 실수값을 저장 가능함.
                                            //정밀도가 떨어지기에 실수 뒤 수문자 혹은 대문자 F를 사용하면 실수 값 입력 가능

        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;            //-21억~21억 사이의 수는 int로서 사용가능 하지만 그 이상의 수의 경우 long을 사용함
                                            //숫자의 뒤에 소문자 혹은 대문자 L을 사용함으로써 int값이 아닌 long의 값임을 나타냄.
        //l = 1_000_000_000_000l:           //가독성을 위해 숫자 사이의 _ 사용가능. 숫자의 의미는 같음
        System.out.println(l);

        // 크기에 맞는 자료형을 사용.(작은 범위를 계산하기 위해 큰 범위를 자료를 사용하면 그만큼 공간이 낭비됨.)
    }
}
