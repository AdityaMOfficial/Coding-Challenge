import java.util.Arrays;

public class Segregate {


    private static void segregate(int[] input){
        int follow = -1;
        for(int current = 0; current<input.length; current++){  //{9, -3, 5, -2, -8, -6, 1, 3}
            if(isNegative(input[current])){                     //follow = 0 && current 2
                follow++;
                swap(input,follow,current);
            }
        }
    }

    private static boolean isNegative(int input) {
        return input < 0;
    }

    private static void swap(int[] arr,int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] input = {9, -3, 5, -2, -8, -6, 1, 3};
        segregate(input);
        System.out.println(Arrays.toString(input));
    }
}
