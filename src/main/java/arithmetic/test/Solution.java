package arithmetic.test;

import java.util.Arrays;

public class Solution {
    int[][] matrix;
    Solution(){

    }
    Solution(int[][] matrix){
        this.matrix = matrix;
    }

    public void minHeapify(int ix, int iy, int rn, int cn){
        int rix = ix;
        int riy = iy + 1;
        int downIx = ix + 1;
        int downIy = iy;
        if(riy > cn && downIx > rn){
            return;
        }
        int minX = rix;
        int minY = riy;
        if(riy <= cn && downIx <= rn && matrix[downIx][downIy] < matrix[rix][riy]){
            minX = downIx;
            minY = downIy;
        }
        if(riy <= cn && matrix[ix][iy] > matrix[minX][minY]){
            swap(ix, iy, minX, minY);
            minHeapify(minX, minY, rn, cn);
        }
    }
    int kthSmallest(int[][] matrix, int k){
        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = matrix[0][0];
            matrix[0][0] = Integer.MAX_VALUE;
            minHeapify(0, 0, matrix.length-1, matrix[0].length-1);
        }
        System.out.println(Arrays.toString(arr));
        return arr[k-1];
    }

    public void swap(int lx, int ly, int rx, int ry){
        int temp = matrix[lx][ly];
        matrix[lx][ly] = matrix[rx][ry];
        matrix[rx][ry] = temp;
    }

    public static void main(String[] args){
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        Solution kthSmallestElementInASortedMatrix = new Solution(matrix);
        int result = kthSmallestElementInASortedMatrix.kthSmallest(matrix, 4);
        System.out.println(result);
    }
}
