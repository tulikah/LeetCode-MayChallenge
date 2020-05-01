package mayChallenge;

public class BadVersion {
	
	

	public static void main(String[] args) {
		String n[] = {"false", "true", "true", "true", "true"};
		int result = getVersion(n);
		System.out.println(result);
	}
	
	private static int getVersion(String[] n) {
		int start = 0;
		int end = n.length-1;
		
		//0 - false;
		//1 - true;
		while(start < end) {
			int mid = (start + (end - start))/2;
			if(n[mid] == "false") { //call the api to get the boolean value
				start = mid+1;				
			} else {
			end = mid;
			}
		}
		return start;
	}

}
