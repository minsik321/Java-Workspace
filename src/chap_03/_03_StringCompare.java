package chap_03;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));  // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python"));    // 대소문자가 구분되기 때문에 false 로 나타냄
        System.out.println(s2.equalsIgnoreCase("python"));
        // 대소문자 구분 없이 문자열 내용이 같은지 여부 확인

        //문자열 비교 심화
        s1 = "1234";    // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";    // s2 에 1234 라는 값이 들어가 있는게 아니라 s1 의 1234 라는 값을 참조 중
        System.out.println(s1.equals(s2));  //true (내용)
        System.out.println(s1 == s2);   //true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));  //true (내용)
        System.out.println(s1 == s2);   // false (참조)
        // s1 과 s2 가 같은 내용을 참조 하는것이 아닌 각각의 메모리에 저장중 이기에 참조를 묻는 == 에는 false 가 나타남

        // 위의 내용은 벽에 붙은 메모지를 모두가 참조 한다는 가정이라면 아래의 new String의 경우는 각각의 다른 메모지 이기에
        // 값이 같더라도 false 가 나타나는것 이다. 따라서 문자열의 경우에는 변수.equals()를 사용 하도록 유의 해야 함
    }
}
