package chap_03;
// "901234-1234567" 인 경우 901234-1 까지 출력
// "030708-4567890" 인 경우 030708-1 까지 출력
public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";

        String dateOfBirth = id.substring(0,6);
        String sex = id.substring(7,8);

        System.out.println(dateOfBirth.concat("-").concat(sex));

        // String id1 = "901231-1234567"; // 주민등록번호 13자리
        // System.out.println(id1.substring(0,8)); // 0 위치에서 8 위치 직전까지
        // id1 = "030708-4567890";
        // System.out.println(id1.substring(0,id1.indexOf("-") + 2)); // 0 위치에서 하이폰 위치 + 2 직전까지
    }
}
