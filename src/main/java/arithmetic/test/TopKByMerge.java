package arithmetic.test;

/**
 * 已知几个递减有序的m个数组，求这几个数据前k大的数
 *适合采用Merge的方法,时间复杂度(O(k*m);
 */
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class TopKByMerge {
    public int[] getTopK(List<List<Integer>> input, int k) {
        int index[] = new int[input.size()];//保存每个数组下标扫描的位置;
        int result[] = new int[k];
        for (int i = 0; i < k; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int j = 0; j < input.size(); j++) {
                if (index[j] < input.get(j).size()) {
                    if (max < input.get(j).get(index[j])) {
                        max = input.get(j).get(index[j]);
                        maxIndex = j;
                    }
                }
            }
            if (max == Integer.MIN_VALUE) {
                return result;
            }
            result[i] = max;
            index[maxIndex] += 1;

        }
        return result;
    }

    public static void main(String[] args){
        TopKByMerge topKByMerge = new TopKByMerge();
        List<List<Integer>> arrayLists = Arrays.asList(Arrays.asList(1, 3, 5), Arrays.asList(2, 4, 6));

        System.out.println(Arrays.toString(topKByMerge.getTopK(arrayLists, 3)));
    }
}