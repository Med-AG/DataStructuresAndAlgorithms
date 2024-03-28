package ds1;


public class FindMin {
    
    public static void main(String[] args) {
        
        int[] arr = {4,7,2,5,9,3,8};
        
        int min = printMin(arr);
        System.out.println("The min value in the array is : " + min);
        
    }

    private static int printMin(int[] arr) {
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
}
