import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class TwoSum {

    public static Vector<Integer> execute(int[] array, int target) {
        Vector<Integer> result = new Vector();

        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == target) {
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }

        }
        return result;
    }

    public static Vector<Integer> execute2(int[] array, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if(map.containsKey(complement)) {
                Vector result = new Vector();
                result.add(map.get(complement));
                result.add(i);
                return result;
            } else {
                map.put(array[i],i);
            }
        }
        return null;
    }
}
