package ds1;


public class FindMissingNumber {
    
    public static void main(String[] args) {
        
        int[] arr = {2,4,1,8,6,3,7};
        
        System.out.println("the mising number is : " + missingNum(arr));
        
    }

    private static int missingNum(int[] arr) {
        
        int n = arr.length + 1;
        int sum = n*(n+1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        
        return sum;
    }
    
}
