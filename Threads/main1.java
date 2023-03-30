public class main1 {
    public static void main(String[] args) throws InterruptedException {
        int [] IntArray = {2,1,3,4,5,6,7,8,90,10};
        long start = System.nanoTime();
        MinThreads MIN = new MinThreads(IntArray);
        MIN.start();
        MaxThread MAX = new MaxThread(IntArray);
        MAX.start();
        MAX.join();
        MIN.join();
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
