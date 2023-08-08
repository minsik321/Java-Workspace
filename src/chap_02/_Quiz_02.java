package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 121;
        String result = (height >= 120) ? "키가 " + height + "cm 이므로 탑승 가능합니다" : "키가 " + height +  "cm 이므로 탑승 불가능합니다";
        System.out.println(result);

        // int height2 = 115;
        // String result2 = (height2 >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        // System.out.println("키가 " + height2 + "cm 이므로 " + result2);

    }
}
