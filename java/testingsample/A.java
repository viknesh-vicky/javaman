package testingsample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A { 
	
	private void stsudent(int id) {
System.out.println("id ="+id);
	}
	private void stsudent(String name,int roolno ) {
		System.out.println("name ="+name+" "+"roolno ="+roolno);

	}
	private void stsudent(long phno,String coursename,int atmno ) {
		System.out.println("phno ="+phno+" "+"coursename ="+coursename+" "+"atmno ="+atmno);

	}
	
	
	
	
	public static void main(String[] args) {
		A s = new A();
		s.stsudent(145);
		s.stsudent("vicky", 123);
		s.stsudent(7358451903L, "java", 3198);
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("a", 1);
//		map.put("b", 2);
//		map.put("c", 3);
//		map.put("d", 4);
//		Set<Entry<String,Integer>> entrySet = map.entrySet();
//		for (Entry<String, Integer> entry : entrySet) {
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println(key + value);
//			
//		}
//		
//		
		
//		List<String> l = new ArrayList<String>();
//		l.add("vicky");
//		l.add("viji");
//		l.add("akassh");
//		l.add("pavi");
//		l.add("susi");
//		System.out.println(l);
//		for (String st : l) {
//			
//		
//			System.out.println(st);
//		
//	
//
//	}
//	System.out.println(l.get(2));
//	System.out.println("====================");
//	System.out.println(l.size());
		
		
		
	}
	
}