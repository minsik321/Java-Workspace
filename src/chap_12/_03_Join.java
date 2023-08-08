package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        // join 이라는 메소드의 역할이 앞의 thread 가 종료 될 때 까지 기다렸다가 다 끝나면 다음 메소드를 실행 함
        // 괄호 안에 시간이 들어가게 되면 그 시간만큼 기다렸다가 다음 thread 를 실행 함
        try {
            thread.join(2500); // 2.5 초 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBose();
    }

    public static void cleanByBose() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
            // Thread.sleep 을 만나게 되면 뒤의 숫자만큼 멈췄다가 다시 실행 (1000 = 1초)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
