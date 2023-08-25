public class SelectionSorting {
    public static void main(String[] args) {
        int arr [] = {2,8,4,-1,7,10,5,6};
        selectionsorting(arr);
    }
    public static void selectionsorting(int arr[]){
        for(int i =0; i<arr.length-1;i++){
            int minval = arr[i];
            int minind= i;

            for(int j =i+1; j<arr.length;j++){
                if(arr[j] < minval){
                    minval = arr[j];
                    minind = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minind];
           arr [minind] = temp;
        }

        for(int i =0; i< arr.length;i++){
//            int val = arr[i];
            System.out.print(arr[i]+ " ");
        }
    }
}
