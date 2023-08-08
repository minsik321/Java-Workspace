package chap_12.clean;

public class Room {
    public int number = 1;
    // synchronized : 동기화 - 다른 thread 가 메소드에 동작을 하고 있을 경우 다른 thread 가 들어오지 못하게 함
    synchronized public void clean(String name) {
        // 직원 1이 : 3번방 청소 완료
        System.out.println(name + " : " + number + "번방 청소 중");
        number++;
    }
}
