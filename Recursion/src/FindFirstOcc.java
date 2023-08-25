public class FindFirstOcc {
    public static void main(String[] args) {
        int arr[] = { 4,1,4,2, 5, 6, 2,7,8,9,7,8,0};
        int target = 22;
        int n = arr.length;
        int index = 0;
        printOcc(arr,n , target,index);
        int ans = printOcc(arr,n , target,index);
        System.out.println(ans);
    }

    private static int printOcc(int[] arr, int n, int target, int index) {
        if(index <0){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return printOcc(arr,n,target,index+1);
        }
    }
}
