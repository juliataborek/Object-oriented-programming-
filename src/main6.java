public class main6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        try {
            System.out.println(arr[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index number is wrong");
        }

    }
}
