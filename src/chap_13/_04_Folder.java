package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);

        folder.mkdir(); // 폴더 생성 (부모 폴더가 존재 할 경우에 만들 수 있음)
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }
        System.out.println("-----------------------");

        folderName = "A/B/C";   // "A\\B\\C", "A" + File.separator + "B" + ...
        // 윈도우 : C:\\User\\Nadocoding\\Desktop
        // 맥 : /User/Nadocoding/Desktop
        folder = new File(folderName);
        folder.mkdirs();        // mkdir 을 사용할 경우 상위 폴더가 없을 경우 만들 수 없음 따라서 mkdirs 를 사용해야 함
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdir)");
        }
    }
}
