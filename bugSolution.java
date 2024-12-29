public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // The loop condition is corrected to i < arr.length
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; 
        }
        System.out.println(arr[4]);
    }
}