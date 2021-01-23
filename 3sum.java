public class 3sum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            System.out.println(Arrays.toString(nums));
    
            List<List<Integer>> result = new ArrayList<>();
            if(nums.length < 3){
                return result;
            }
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            System.out.println(nums.length);
    
            for(int i=0; i<nums.length-2; i++){
                int j = i+1;
                int k = nums.length-1;
                while(j<k){
                    if(-nums[i] == nums[j] + nums[k]){
                        System.out.println("yo");
                        List<Integer> goodSet = new ArrayList<>();
                        goodSet.add(nums[i]);
                        goodSet.add(nums[j]);
                        goodSet.add(nums[k]); 
                        if(result.size()>0){
                           if(!Arrays.toString(goodSet.toArray()).equals(Arrays.toString(result.get(result.size()-1).toArray()))){
                            result.add(goodSet);
                            } 
                        }else{
                            result.add(goodSet);
                        }
                        j++;
                    }else if(nums[i] + nums[j] + nums[k] < 0){
                        j++;
                    }else{
                        k--;
                    }
                }
                if(nums.length>4){
                   while(nums[i] == nums[i+1] && i < nums.length-2){
                    i++;
                    } 
                }
                
            }
        return result;
        }
    }
}
