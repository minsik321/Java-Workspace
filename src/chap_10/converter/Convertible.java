package chap_10.converter;

@FunctionalInterface    // 함수형 인터페이스로 사용하기 위해 나타냄. 추상 메소드가 하나만 존재 해야 함
public interface Convertible {
    void convert(int USD);
}
