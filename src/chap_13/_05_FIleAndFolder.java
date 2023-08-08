package chap_13;

import javax.swing.*;
import java.io.File;

public class _05_FIleAndFolder {
    public static void main(String[] args) {
        // String folder = "C:\\Users\\김채현\\OneDrive\\바탕 화면\\민식\\JavaWorkspace\\src\\chap_13";    // . 은 현재 위치를 말 함
        String folder = "src/chap_13"; // 위의 경로는 절대 경로, 아래의 경로는 상대경로임
        File filaAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filaAndFolders.getAbsolutePath());
        for (File file : filaAndFolders.listFiles()) {
            if (file.isFile()) {
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
        }
    }
}
