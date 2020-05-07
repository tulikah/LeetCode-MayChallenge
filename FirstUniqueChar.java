package mayChallenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class FirstUniqueChar {

	public static void main(String[] args) {
		String s = "loveleetcode";
		int ans = 0;
		int min = Integer.MAX_VALUE;
		HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			char current = s.charAt(i);
			if(!myMap.containsKey(current)) {
				myMap.put(current, i);
			} else {
				myMap.put(current, -1);
			}
		}
				
		
		for(char ch : myMap.keySet()) {
				if(myMap.get(ch) < min && myMap.get(ch) != -1) {
					min = myMap.get(ch);
				
				}
			}
		System.out.println(min == Integer.MAX_VALUE ? -1 : min);
		}
	
		}
	
