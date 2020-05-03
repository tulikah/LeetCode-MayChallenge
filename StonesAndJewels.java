package mayChallenge;

import java.util.HashMap;
import java.util.Map;

public class StonesAndJewels {

	public static void main(String[] args) {
		String J = "z";
		String S = "ZzZ";
			
		
		Map<Character, Number> mymap = new HashMap<Character, Number>();
		for(int i=0;i<S.length();i++) {
            char ch = S.charAt(i);
			if(!mymap.containsKey(ch)) {
				mymap.put(ch, 1);
			} else {
				Integer count = (Integer) mymap.get(ch);
				mymap.put(ch, count+1);
			}
		}
		int sum = 0;
		for(int t = 0; t < J.length(); t++) {
			for (Map.Entry<Character, Number> entry : mymap.entrySet()) {
				if(J.charAt(t) == entry.getKey()) {
					sum = sum + (int)entry.getValue();
					
				}
			}
		}
		System.out.println(sum);
		
		
	}

}
