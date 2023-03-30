public class main3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();
        mt1.start();
        mt1.join();
        mt2.start();
        mt2.join();
    }
}
