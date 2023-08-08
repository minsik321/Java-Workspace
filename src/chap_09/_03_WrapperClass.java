package chap_09;

import java.util.function.IntToDoubleFunction;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스
        // int double float char 와 같은 기본 자료형을 객체의 형태로 만들어서 사용 할 수 있게 함
        // 메소드도 사용 할 수 있음

        Integer i = 123; // int i = 123;
        Double d = 1.0; // double d = 1.0;
        Character c = 'A'; // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("-----------------");

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("-----------------");
        String s = i.toString();
        System.out.println(s);

    }
}
