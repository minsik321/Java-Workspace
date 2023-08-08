package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        ProductA productA = new ProductA();
        ProductB productB = new ProductB();
        Thread productAThread = new Thread(productA);
        Thread productBThread = new Thread(productB);

        productAThread.start();
        productBThread.start();

//        while (productAThread.isAlive() || productBThread.isAlive()) {
//        }

        try {
            productAThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            productBThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        PrepareSet();

//        Pro pro1 = new Pro("A");
//        Pro pro2 = new Pro("B");
//        Thread Pro1Thread = new Thread(pro1);
//        Thread Pro2Thread = new Thread(pro2);
//
//        Pro1Thread.start();
//        Pro2Thread.start();
    }


    public static void PrepareSet() {
        System.out.println(" == 세트 상품 포장 시작 == ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("세트 상품 포장 " + i + "/5");
        }
        System.out.println(" == 세트 상품 포장 완료 == ");
    }
}
class ProductA implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("A 상품 준비 " + i + "/5");
        } System.out.println(" -- A 상품 준비 완료 -- ");
    }
}
class ProductB implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("B 상품 준비 " + i + "/5");
        } System.out.println(" -- B 상품 준비 완료 -- ");
    }
}

//class Pro implements Runnable {
//    public Pro(String name) {
//        this.name = name;
//    }
//
//    String name;
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(name + " 상품 준비 " + i + "/5");
//        } System.out.println(" -- " + name + " 상품 준비 완료 -- ");
//    }
//}