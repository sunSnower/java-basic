package arithmetic.test;

import java.util.ArrayList;
import java.util.List;

public class Median {
    /**
     * 求两个有序数组的中位数
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static double getMedian(int[]nums1, int[]nums2){
        List<Integer> list = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while(true){
            if(index1>=nums1.length && index2>=nums2.length){
                break;
            }
            if(index1<nums1.length && index2<nums2.length){
                if(nums1[index1] <= nums2[index2]){
                    list.add(nums1[index1++]);
                }
                else{
                    list.add(nums2[index2++]);
                }
            }
            if(index1 == nums1.length){
                while(index2 < nums2.length){
                    list.add(nums2[index2++]);
                }
                break;
            }
            if(index2 == nums2.length){
                while(index1 < nums1.length){
                    list.add(nums1[index1++]);
                }
                break;
            }
        }

        if(list.size() %2 != 0){
            return Double.parseDouble(String.valueOf(list.get(list.size()/2)));
        }
        else{
            return Double.sum(Double.parseDouble(String.valueOf(list.get(list.size()/2))), Double.parseDouble(String.valueOf(list.get((list.size()-1)/2))))/2;

        }
    }

    public static void main(String[] args){
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(getMedian(nums1, nums2));
    }

}
