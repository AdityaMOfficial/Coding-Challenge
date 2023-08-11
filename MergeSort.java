import java.util.Arrays;

public class MergeSort {


    private static void mergeSort(int[] arr, int start,int end){
        if(start<end){
            int mid = start + (end-start)/2;

            mergeSort(arr,start,mid);
             mergeSort(arr,mid+1,end);
             merge(arr,start,mid,end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] leftArr = Arrays.copyOfRange(arr,start,mid+1);
        int[] rightArr = Arrays.copyOfRange(arr,mid+1,end+1);
        System.out.println(Arrays.toString(leftArr)+","+Arrays.toString(rightArr)+","+start+","+mid+","+end);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,start,end+1)));
        int i=0,j=0,k = start;

        while(i<leftArr.length && j< rightArr.length){
            if(leftArr[i]<rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i<leftArr.length){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j<rightArr.length){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {
        int[] arr = {24,26,23,16,63,84,73};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
