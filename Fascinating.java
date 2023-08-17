import java.util.HashSet;
import java.util.Set;

public class Fascinating {

    private static void solve(int N){
        int into2 = N*2;
        int into3 = N*3;
        String res = String.valueOf(N) + String.valueOf(into2) + String.valueOf(into3);
        long result = Long.parseLong(res);
        Set<Long> set = new HashSet<>();
        while(result>0)
        {
            if(result%10 != 0)
                set.add(result%10);
            result = result/10;
        }
        if(set.size()==9 && set.size() == res.length())
            System.out.println("Fascinating");
        else
            System.out.println("Not Fascinating");

     }

    public static void main(String[] args) {
        solve(853);
    }
}
