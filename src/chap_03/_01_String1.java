package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이   (sout 안에 변수.length()를 하거나 글자를 드래그 하면 오른쪽 아래에 (chars)로 나타나짐)
        System.out.println(s.length()); // 29

        // 대소문자 변환   (변수.toUpperCase() 이거나 변수.toLowerCase() 를 사용하여 변환)
        System.out.println(s.toUpperCase());    // 대문자로
        System.out.println(s.toLowerCase());    // 소문자로

        // 포함 관계      (변수.contains()를 활용하여 ""안에 글자가 변수에 포함이 되었는지 여부 확인)
        System.out.println(s.contains("Java")); // 포함된다면 true / 포함되지 않는다면 false
        System.out.println(s.contains("C#"));   // 포함되지 않았기에 false
        // 포함 관계를 확인하여 위치 정보를 나타냄 (변수.indexOf()를 활용하여 ""안에 글자의 순서를 나타냄)
        System.out.println(s.indexOf("Java"));  // 위치 정보 7  (문장에서 글자 순서는 0부터 시작)
        System.out.println(s.indexOf("C#"));    // 포함되지 않는다면 (-1)
        System.out.println(s.indexOf("and"));   // 처음으로 일치하는 정보 (12)
        System.out.println(s.lastIndexOf("and"));   // 마지막 일치하는 위치 정보 (23)
        System.out.println(s.startsWith("I like"));     // 이 문자열로 시작하면 true (아니면 false)
        System.out.println(s.endsWith("."));            // 이 문자열로 끝나면 true (아니면 false)
    }
}
