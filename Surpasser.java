import java.util.Arrays;

public class Surpasser {


    private static void solve(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int count = 0;
            while(j<arr.length){
                if(arr[j]>arr[i]){
                    count++;
                }
                j++;
            }
            arr[i] = count;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 9, 7, 10};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }
}
