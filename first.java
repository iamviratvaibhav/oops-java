public class first {
//    public static void main(String[] args) {
       static long maxSubarraySum(int[] arr) {
        long maxSum=arr[0];
        long currSum=arr[0];
        for(int i=1 ; i<arr.length; i++){
            currSum=Math.max(arr[i], arr[i]+currSum);
            maxSum=Math.max(currSum, maxSum);
        }
        return maxSum;
        }

    public static void main(String[] args) {
            int arr[]={-1 ,-2, -3,5,6,7};
        System.out.println(maxSubarraySum(arr));
    }
}
