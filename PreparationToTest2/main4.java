public class main4  {
    public static void main(String[] args) throws InterruptedException {
        //16
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        t.join();
        System.out.println("The main program is running");
    }
}
