package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어을리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123), 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능 (숫자로는 안됨)
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 사작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName = "민식"; //이름
        String lastName = "김"; //성
        String dateOfBrith = "1998-03-21"; //생년월일
        String residentialAddress = "무슨 호텔"; //체류지
        String purposeOfVisit = "관광"; //입국 목적
        String flightNo = "KE657"; // 항공 편명
        String _fightNo = "KE657"; //밑줄 시작
        String flight_no_2 = "KE657"; //밑줄과 숫자 포함
        // String -fiingtNo = "KE657"; 안되는 예(String 변수 이름에 - 먼저 사용)

        int accompany = 2; //동반 가족 ㅅ
        int lenfthOfStay = 5; //체류 기간

        String item1 = "시계";
        String item2 = "가방";
        // String 3item = "전자 제품"; // 안되는 예(String 변수 이름에 숫자 먼저 사용)

        //프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";

        //변수의 경우 수정이 가능 했으나 상수의 경우 이후 수정이 안됨 (상수는 대문자로 보통 적음)
        final String CODE = "KR";
        //CODE = "US";   //상수의 경우 이후 수정 불가
    }
}
