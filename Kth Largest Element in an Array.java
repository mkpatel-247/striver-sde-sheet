class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for(int n : nums){
            queue.add(n);
            if(queue.size() > k){
                queue.remove();
            }
        }
        return queue.peek();
    }
}
