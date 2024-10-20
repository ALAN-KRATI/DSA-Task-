class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxfreq = 0;
        int totalsum = 0;

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> set = map.keySet();

        for(int i: set){
            maxfreq = Math.max(maxfreq, map.get(i));
        }

        for(int i : set){
            if(map.get(i) == maxfreq){
                totalsum += map.get(i);
            }
        }

        return totalsum;
    }
}