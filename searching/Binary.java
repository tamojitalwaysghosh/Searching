package searching;

public class Binary{
    public static int binarySearch(int[] arr, int target, int left, int right){
        if(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return binarySearch(arr, target, left, mid-1);
            }
            else{
                return binarySearch(arr, target, mid+1, right);
            }
        }

        return -1;
    }
    
    public static void main(String[] args){
        int[] arr= new int[]{1,2,2,3,4,5,6,7};
        int target= 2;
        int index= binarySearch(arr, target, 0, arr.length-1);

        System.out.println(target+" found at index: "+index);
    }
}