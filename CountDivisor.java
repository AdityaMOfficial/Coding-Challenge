public class CountDivisor {

    private static int solve(int N){
        int temp = N;
        int count = 0;
        while(temp>0){
            int r = temp%10;
            temp = temp/10;
            if(N%r == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve(23));
    }
}
