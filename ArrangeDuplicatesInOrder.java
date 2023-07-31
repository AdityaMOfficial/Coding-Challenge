import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ArrangeDuplicatesInOrder{
    private static void arrangeDuplicatesInOrder(int[] arr){
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        for(int element : arr){
            if(linkedHashMap.containsKey(element)){
                linkedHashMap.put(element,linkedHashMap.get(element)+1);
            }else
                linkedHashMap.put(element,1);
        }


        Set<Map.Entry<Integer,Integer>> entrySet = linkedHashMap.entrySet();
        entrySet.stream().forEach((entry)->{
            for(int i=1;i<=entry.getValue();i++){
                System.out.print(entry.getKey()+" ");
            }
        });

    }

    public static void main(String[] args) {
        arrangeDuplicatesInOrder(new int[]{ 5, 4, 5, 5, 3, 1, 2, 2, 4});
    }
}
