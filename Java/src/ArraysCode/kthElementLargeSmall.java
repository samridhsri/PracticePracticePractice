package ArraysCode;

import java.util.PriorityQueue;

public class kthElementLargeSmall {

    public static int findKthLargest(int[] nums, int k) {

        if(nums.length < 1){
            return -1;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: nums){
            pq.add(i);
        }

        for(int j=0; j<(nums.length- k); j++){
            pq.poll();
        }
        return pq.poll();

    }

    public static void main(String[] args) {
        int[] tr = {3,2,1,5,6,4};
        System.out.println(findKthLargest(tr, 3));

    }
}
