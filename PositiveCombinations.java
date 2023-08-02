import java.util.Arrays;

public class PositiveCombinations {

    private static void solve(int N){
        int[] arr = new int[N];
        Arrays.fill(arr,1);
        for(int i=arr.length-1;i>=0;i--){
            if(i==0) {
                arr[i] = N;
                printArray(arr);
                continue;
            }
            printArray(arr);
            if((arr[i]-arr[i-1]) < 2)
            {
                arr[i-1] = arr[i-1]+arr[i];
                arr = Arrays.copyOf(arr,i);
            }else{
                arr[i-1]++;
                arr[i]--;
                i++;
            }
        }
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for(int a : arr)
            System.out.print(a + " ");
    }

    public static void main(String[] args) {
        solve(4);
    }
}
