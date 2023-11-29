package uygulama1;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		if(-Math.pow(10, 9) <= target && target <= Math.pow(10, 9)) {
			if(2 <= nums.length && nums.length <= Math.pow(10, 4)) {
				for(int i = 0; i < nums.length; i++) {
					if(-Math.pow(10, 9) <= nums[i] && nums[i] <= Math.pow(10, 9)) {
						for(int j = i + 1; j < nums.length; j++) {
							if(nums[j] == target - nums[i]) {
								return new int[] {i ,j};
							}
						}
					}
				}
			}
		}
		return null;
		//çalışıyo
    }
}
