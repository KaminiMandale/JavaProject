package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>basket= new HashMap<String,Integer>();
		
		basket.put("item1", 1);
		basket.put("item1", 5);
		basket.put("item1", 2);
		basket.put("item1", 2);
		
		System.out.println("the map is " + basket);
		basket.put("item3", 4);
		System.out.println("the map after change is " + basket);
		
		basket.remove("item2");
		System.out.println("the map after delete " + basket);
        
		for(String item:basket.keySet()) {
			
			System.out.println("Item name is " + item);
			System.out.println("Item quantity is " + basket.get(item));
		}	
		
		for(Integer val: basket.values()) {
			System.out.println("the values is " +val);
		}
		String str = "clean world Green World Happy World";
		
		String[] arr1 = str.split(" ");
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
     for(String word:arr1) {
    	 if(!map1.keySet().contains(word)) {
    		 map1.put(word, 1);
    	 }
    	 else {
    		 map1.put(word, map1.get(word)+1);
    	 }
    
    	 }
	
	}

}
