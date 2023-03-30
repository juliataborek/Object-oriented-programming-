public class MinThreads extends Thread{
    int [] IntArray;
    MinThreads(int [] IntArray){
        this.IntArray = IntArray;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int min = IntArray[0];
        for (int i =1; i<=9;i++){
            if(IntArray[i]<min){
                min = IntArray[i];
            }
        }
        System.out.println(min);
    }
}
