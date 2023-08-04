import java.util.HashSet;
import java.util.Set;

public class PairsDivideByK {

    private static void solve(int[] arr,int K){
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < arr.length;i++)
            for(int j = i+1;j < arr.length;j++){
                if((arr[i]+arr[j])%K==0) {
                    set.add(arr[i]);
                    set.add(arr[j]);
                }
            }

        System.out.println(set);
        if(arr.length == set.size())
            System.out.println("Pairs can be formed");
        else
            System.out.println("Pairs cannot be formed");
    }

    public static void main(String[] args) {

        solve(new int[]{ 3, 1, 2, 6, 9, 4},6 );
    }
}
