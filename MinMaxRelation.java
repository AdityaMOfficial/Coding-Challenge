public class MinMaxRelation {




    private static int solve(int[] arr){

        int max_subarray = 0;
        for(int i=0; i< arr.length && arr.length-i >max_subarray;i++){

            int min = arr[i];
            int max  = arr[i];

            for(int j=i;j<arr.length;j++)
            {
                min = Integer.min(min,arr[j]);
                max = Integer.max(max,arr[j]);

                if(2*min<=max)
                {
                    break;
                }
                max_subarray = Integer.max(max_subarray,j-i+1);
            }
        }
    return arr.length - max_subarray;
    }


    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 6, 1, 7, 5, 9, 2}));
    }
}
