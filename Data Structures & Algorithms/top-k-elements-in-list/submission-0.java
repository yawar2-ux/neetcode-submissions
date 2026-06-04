class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i]) +1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> li = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            li.add(entry);
        }
        li.sort((a,b) -> b.getValue() - a.getValue());

        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i]=li.get(i).getKey();
        }
           
        return ans;

    }

    

}

