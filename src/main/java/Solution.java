import java.util.Arrays;

public class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0; // 0 insertion index
        int j = n - 1; // 2 insertion index
        int k = 0;
        while (k <= j) {
            if(nums[k] == 0){
                nums[k] = nums[i];
                nums[i++] = 0;
            }
            if(nums[k] == 2) {
                nums[k] = nums[j];
                nums[j--] = 2;
                k--;
            }
            k++;
        }
    }
}
