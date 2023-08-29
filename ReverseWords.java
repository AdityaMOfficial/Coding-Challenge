import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {

    private static String solve(String input){
        if(input==null)
            return null;


        return Arrays.stream(input.split(" "))
                .map(word -> Arrays.stream(word.split("")).reduce((a,b) -> b+a).get())
                .collect(Collectors.joining(" "));
    }


    private static String solveWithoutStreamApi(String input){
        if(input==null)
            return null;
        String[] inputArray = input.split("");
        int i = 0;
        for(int j=0;j<input.length();j++){
            if(input.charAt(j)==' ')
            {
                reverse(inputArray,i,j-1);
                i = j+1;
            }
        }
        if(i<input.length())
            reverse(inputArray,i,inputArray.length-1);
        StringBuilder output = new StringBuilder("");
        for(String s : inputArray){
            output.append(s);
        }
        return output.toString();
    }

    private static void reverse(String[] input, int start, int end) {
        while(start<end)
        {
            String temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println(solveWithoutStreamApi("God Ding"));
    }
}
