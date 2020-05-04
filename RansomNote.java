package mayChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class RansomNote {

	public static void main(String[] args) {
		

		String ransomNote = "chejaccdae";
		String magazine = "geceeibccchjejhdd";
		boolean ans = false;
		
		if(ransomNote.length() == 0 || magazine.length() == 0) {
			ans = true;

		}

		Map<Character, Integer> mymapMag = new HashMap<Character, Integer>();
		for(int i=0;i<magazine.length();i++) {
            char chNote = magazine.charAt(i);
			if(!mymapMag.containsKey(chNote)) {
				mymapMag.put(chNote, 1);
			} else {
				Integer count = (Integer) mymapMag.get(chNote);
				mymapMag.put(chNote, count+1);
			}
		}
		
		for(char i: ransomNote.toCharArray()) {
			if(mymapMag.containsKey(i)) {
				if(mymapMag.get(i)==0) {
	                ans = false;
	                break;
				} else {
					mymapMag.put(i, mymapMag.get(i)-1);
					ans = true;	
				}

			} else {ans = false;break;}
				
			
			}

		
		System.out.println(ans);
	}

}
