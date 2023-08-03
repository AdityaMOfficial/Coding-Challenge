import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntegerShuffling {

    private static void shuffle(int[] nums,int[] pos){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],pos[i]);
        }
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            nums[entry.getValue()] = entry.getKey();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] pos = {3,2,4,1,0};
        shuffle(nums,pos);
        for(int num : nums)
            System.out.print(num + " ");
    }
}
