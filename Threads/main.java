public class main {
    public static void main(String[] args) throws InterruptedException {
        int [] IntArray = {2,1,3,4,5,6,7,8,90,10};
        long start = System.nanoTime();
        int min = IntArray[0];
        for (int i =1; i<=9;i++){
            if(IntArray[i]<min){
                min = IntArray[i];
            }
        }
        Thread.sleep(1000);
        System.out.println(min);
        int max = IntArray[0];
        for (int i =1; i<=9;i++) {
            if (IntArray[i] > max) {
                max = IntArray[i];
            }
        }
        Thread.sleep(1000);
        System.out.println(max);
        long end = System.nanoTime();
        System.out.println(end - start);
    }


}
