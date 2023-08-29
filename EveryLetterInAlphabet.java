
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class EveryLetterInAlphabet {

    private static boolean everyAlphabetContainedCheck(String str){
        if(str == null)
            return false;

        if(str.length() < 26)
            return false;

        Set<Character> characterSet = str.chars().mapToObj(i -> (char)i).collect(Collectors.toSet());

        return characterSet.size() == 26;
    }

//    public static int[] twoSum(int[] numbers, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        int[] result = new int[2];
//        for(int i=0;i<numbers.length;i++){
//            int num = numbers[i];
//            int other = target - num;
//            if(map.containsKey(other))
//            {
//                result[0] = Integer.min(i+1,map.get(other)+1);
//                result[1] = Integer.max(i+1,map.get(other)+1);
//                break;
//            }else{
//                map.put(num,i);
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {

        System.out.println(everyAlphabetContainedCheck("leetcode"));
//        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
    }
}
