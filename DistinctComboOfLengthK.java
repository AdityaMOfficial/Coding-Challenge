import java.util.*;
import java.util.stream.Collectors;

public class DistinctComboOfLengthK {
    private static void findDistinctCombinationsOfArray(int[] array,int[] copy, int k,int start){

        if(start==0)
            array = Arrays.stream(array).sorted().distinct().toArray();

        if (k == 0) {
            System.out.println(Arrays.toString(copy));
            return;
        }
        else {
            for (int i = 0; i < array.length; i++) {
                copy[start]=array[i];
                if(start>0 && copy[start]>copy[start-1])
                    return;
                findDistinctCombinationsOfArray(array,copy,k-1,start+1);
            }
        }
    }

    public static void main(String[] args) {

        findDistinctCombinationsOfArray(new int[]{1, 2,1},new int[2],2,0);
    }
}
