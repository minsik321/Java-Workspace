package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User> {
    // <> 안에 상속하는 class 를 지정함으로써 원하는 형태의 객체만 받도록 처리 할 수 있음
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
