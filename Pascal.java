import java.util.ArrayList;
import java.util.List;

public class Pascal {


//    private static List<List<Integer>> ans = new ArrayList<>();
    private static List<Integer> pascal(int N,int Spaces){
        if(N==2) {
            printArray(List.of(1),Spaces+1);
            printArray(List.of(1,1),Spaces);
            return List.of(1,1);
        }
        List<Integer> prevResult = pascal(N-1,Spaces+1);
        List<Integer> currentResult = new ArrayList<>();
        currentResult.add(1);
        int i=0,j=1;
        while(j<prevResult.size())
        {
            currentResult.add(prevResult.get(i)+prevResult.get(j));
            i++;j++;
        }
        currentResult.add(1);
        printArray(currentResult,Spaces);
        return currentResult;
    }

    private static void printArray(List<Integer> integers,int Spaces) {
        System.out.println();
        for(int x=0;x<Spaces;x++)
            System.out.print(" ");
        for(int i : integers)
            System.out.print(i+" ");
    }

    public static void main(String[] args) {
        pascal(5,0);
//        System.out.println(ans);
    }
}
