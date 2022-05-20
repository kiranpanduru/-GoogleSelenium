package org.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Reversal {

	public static void main(String[] args) {
		String s="java is easy java is simple";
		String[] split = s.split(" ");
		Map<String , Integer> mp=new LinkedHashMap<>();
		for (String x : split) {
			if (mp.containsKey(x)) {
				
				Integer count = mp.get(x);
				mp.put(x, count+1);
			}else {
				mp.put(x, 1);
			}
			
		}Set<Entry<String, Integer>> entrySet = mp.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey());
				
			}
			
		}
		

			
		
		
		}

		}
	


