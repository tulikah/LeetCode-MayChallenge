package mayChallenge;

// ***************************************LEETCODE SOLUTION***********************************************************
//public class Solution extends VersionControl {
//    public int firstBadVersion(int n) {
//        int start = 1;
//		int end = n;
//
//
//           while(start < end) {
//			int mid = start + (end-start)/2;
//			if(isBadVersion(mid) == false) { 
//				start = mid+1;				
//			} else {
//			    end = mid;
//			}
//		} 
//        	
//		return start;
//}
//}
//


public class BadVersion {
	
	

	public static void main(String[] args) {
		String n[] = {"false","false","false","true","true"};
		int result = getVersion(n);
		System.out.println(result);
	}
	
	private static int getVersion(String[] n) {
		int start = 1;
		int end = n.length;

		while(start < end) {
			int mid = start + end/2;
			if(n[mid] == "false") { 
				start = mid+1;				
			} else {
			end = mid;
			}
		}
		return start;
	}

}
