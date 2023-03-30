public class MaxThread extends Thread{
    int [] IntArray;
    MaxThread(int [] IntArray){
        this.IntArray = IntArray;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int max = IntArray[0];
        for (int i =1; i<=9;i++) {
            if (IntArray[i] > max) {
                max = IntArray[i];
            }
        }
        System.out.println(max);
    }
}
