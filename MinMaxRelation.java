public class MinMaxRelation {




    private static int solve(int[] arr,int start, int end, int ogSize){

        if(end-start+1 == 1)
            return ogSize-1;

        int min = 0;
        int max = 0;

        for(int i=start; i<end; i++){
            if(arr[i]<arr[min])
                min = i;
            else if(arr[i]> arr[max])
                max = i;
        }

        if(2*arr[min] > arr[max])
            return ogSize - end + start;
        else
        {
            return minimum(solve(arr,start,min-1,ogSize), solve(arr,min+1,end,ogSize) );
        }
    }

    private static int minimum(int a, int b) {
        return a<b?a:b;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 6, 1, 7, 5, 9, 2},0,4,5));
    }
}
