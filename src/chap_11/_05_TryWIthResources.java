package chap_11;

import java.io.BufferedWriter;

public class _05_TryWIthResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        // Try With Resources
        // Try 구문 내에서 사용할 어떤 리소스 (파일 객체) 를 괄호 속에서 정의 하게 되면 자동으로 Try Catch 구문을 빠져나올 때
        // close(); 를 호출 함 - 조건으로는 앞선 객체는 AutoCloseable 라는 인터페이스를 구현 해야 함.
        try (MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("빵이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedWriter bw = null;
        // 파일을 사용하기 위해 자주 사용되는 구문인데 들어가서 확인 해 보면 뒤쪽에서 AutoCloseable 이라는 인터페이스를
        // 상속 하고 있기 때문에 try 구문 내에 사용하게 될 경우에 자동으로 close(); 를 호출하게 됨
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }
}