class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> s = new HashMap<>(); 
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int diff = target - num;
            if(s.containsKey(diff)){
                return new int[]{s.get(diff),i};
            }
            s.put(num,i);
        }
        return new int[] {};
    }
}