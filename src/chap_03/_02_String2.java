package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace("and",","));   // "and" 를 "," 로 변환
        System.out.println(s.substring(7));     // 인덱스 기준 7 부터 시작 (이전 내용 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        // indexOf 를 활용하여 Java 라는 글자의 위치를 파악하고 substring 이라는 기능을 활용하여 나타냄
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작과 끝 위치를 모두 지정하여 나타냄
        // 시작 위치의 경우 시작 지점을 포함하여 나타내지만 끝 위치의 경우 포함하지 않고 그 직전까지를 나타냄

        // 공백 제거
        s = "              I love Java.       ";
        System.out.println(s);
        System.out.println(s.trim());   // 불필요한 앞 뒤 공백을 모두 제거

        // 문자열 결함
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);    //JavaPython
        System.out.println(s1 + "," + s2);  //Java,Python
        System.out.println(s1.concat(",").concat(s2));  //Java,Python
    }
}
