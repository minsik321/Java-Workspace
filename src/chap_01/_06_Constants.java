package chap_01;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.sql.SQLOutput;

public class _06_Constants {                        //변수 앞에 final을 붙힘으로써 상수 값이 됨
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82";       //상수는 모두 대문자이기에 가독성을 위해 _로 띄어쓰기 나타냄
        // KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592;
        final String DATE_0F_BRITH = "2001-12-31";
    }
}
