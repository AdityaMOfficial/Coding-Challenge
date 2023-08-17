import java.util.Arrays;

public class WaterJugs {


    private static void quickSort(int[] arr, int start, int end){

        if(start<end){
            int part = partition(arr,start,end);
            quickSort(arr,start,part-1);
            quickSort(arr,part+1,end);
        }

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] redJugs = {6, 3, 2, 8, 7};
        quickSort(redJugs,0,redJugs.length-1);
        System.out.println(Arrays.toString(redJugs));



        int[] blueJugs = {8, 6, 7, 2, 3};
        quickSort(blueJugs,0,blueJugs.length-1);
        System.out.println(Arrays.toString(blueJugs));
    }
}
