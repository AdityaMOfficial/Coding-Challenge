import java.util.Arrays;

public class HeightsOfTowers {


    private static int solve(int[] array, int N, int K){

        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            int[] tempArray=array.clone();
            int min1=Integer.MAX_VALUE;
            int max1=Integer.MIN_VALUE;
            for (int j = 0; j < array.length; j++) {
                if(j<=i){
                    tempArray[j]=tempArray[j]+K;
                }
                else {
                    tempArray[j]=tempArray[j]-K;
                }
                if(min1>tempArray[j]){
                    min1=tempArray[j];
                }
                if(max1<tempArray[j]){
                    max1=tempArray[j];
                }
            }
            if(minDiff>max1-min1){
                minDiff=max1-min1;
            }
        }
        return minDiff;

    }


    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 5, 8, 10},4,2));
    }
}
