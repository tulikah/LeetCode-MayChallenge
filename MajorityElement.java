package mayChallenge;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		int nums[] = {2,2,1,1,1,2,2}; 
		int max = Integer.MIN_VALUE;
		int ans = 0;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i< nums.length; i++) {
			int key = nums[i];
			if(!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				int val = map.get(key);
				map.put(key, val+1);
			}
		}
		
		for(int count : map.keySet()) {
			if(map.get(count) > max) {
				max = map.get(count);
				ans = count;
			}
	
		}
		 System.out.println(ans);
	}

}
