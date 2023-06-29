package ArraysCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {

    public static int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();

        int i = 0;
        int j = i+1;
        int[] current = arr[i];

        while (j < arr.length) {
            if (current[1] >= arr[j][0]) {
                current = new int[]{current[0], Math.max(current[1], arr[j][1])};
                j++;
            } else {
                ans.add(current);
                current = arr[j++];
            }
        }

        ans.add(current);

        return ans.toArray(new int[0][]);

    }

    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,6}, {8,10}, {15,18}};

        int[][] res = merge(arr);

        for(int i=0; i<res.length; i++){
            for(int j = 0; j<res[i].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
