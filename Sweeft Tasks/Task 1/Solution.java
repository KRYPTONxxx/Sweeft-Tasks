public class Solution {
    int singleNumber(int[] nums){

        int counter = -1;

        for (int i = 0; i <nums.length;i++) {
            if (counter == 0){
                return nums[i-1];
            }
            counter=0;
            for (int j = 0; j <nums.length; j++) {

                if (i==j){
                    continue;
                }
                else if(nums[i] == nums[j]){
                    counter++;

                }

            }

        }
        return 0;
    }

}
