import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeypadCombinations {

    public static final int INITIAL_INDEX = 0;
    private static List<String> keypad = List.of("","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ");
    private static List<String> output = new ArrayList<>();

    private static void solveRec(int[] input,int inputArrayIndex, String currentOutput){


        if(currentOutput.length() == input.length)
        {
            KeypadCombinations.output.add(currentOutput);
            return;
        }


        String currentInputString = keypad.get(input[inputArrayIndex]);

        for(int i=0;i<currentInputString.length();i++){
            solveRec(input,inputArrayIndex+1,currentOutput + currentInputString.charAt(i));
        }

    }

    public static void main(String[] args) {

        int input[] = new int[]{2,3,4};
        String output = "";
        solveRec(input, INITIAL_INDEX, output);
        System.out.println(KeypadCombinations.output);
    }
}
