import java.util.Arrays;

public class MyThread implements Runnable{
    int[] arr;

    MyThread(int[] arr){this.arr =arr;}
    public void run() {

        Arrays.sort(arr);
        System.out.println("Maximum value is: "+arr[arr.length-1]);
    }

}