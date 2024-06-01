package searching;

public class Linear{
    public static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr= new int[]{1,2,2,3,4,2,5,7};
        int target= 5;
        int index= linearSearch(arr, target);

        System.out.println(target+" found at index: "+index);
    }
}