package chap_05;

// 사이즈 250 (재고 있음)
// 사이즈 255 (재고 있음)
// 사이즈 260 (재고 있음)
// 사이즈 265 (재고 있음)
// ...
// 사이즈 295 (재고 있음)

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] size = new int[10];
        for (int i = 0; i < size.length; i++) {
            System.out.println("사이즈 " + (250 + (i * 5)) + " (재고 있음)");
        }

            System.out.println("-------------------");

//            int[] sizeArray = {250, 255, 260 ... 295}
            int[] sizeArray = new int[10];
            for (int j = 0; j < size.length; j++) {
                sizeArray[j] = 250 + (5 * j);
            }
        for (int sizes : sizeArray) {
            System.out.println("사이즈 " + sizes + " (재고 있음)");
        }


    }
}
