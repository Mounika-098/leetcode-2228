class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> finaloutput = new ArrayList<>();
        
        for(int i = 0;i<nums.length;i++)
        {
            int start = nums[i];
            while(i+1 < nums.length && nums[i]+1 == nums[i+1] )
            {
                i++;
            }
            if(start!=nums[i])
            {
                finaloutput.add(""+start+"->"+nums[i]);
            }
            else
            finaloutput.add(""+start);
        }
        return finaloutput;
    }
    
}