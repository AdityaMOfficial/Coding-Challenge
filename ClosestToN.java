public class ClosestToN {

    private static int solve(int N, int M){
        M = Math.abs(M);
        int R = N % M;

        int num1 = N-R;
        int num2;
        if(N>0)
            num2 = num1 + M;
        else
            num2 = num1 - M;
//        System.out.println(num1);
//        System.out.println(num2);
        return Math.abs(N-num1) < Math.abs(num2-N)?num1 : num2;
    }

    public static void main(String[] args) {
        System.out.println(solve(-15,6));
    }
}
