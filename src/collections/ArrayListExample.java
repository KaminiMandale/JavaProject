package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"kamini","john","ujval", "sandhya"};
		System.out.println("the second name is " +names[1]);

	ArrayList<String> list1 =  new ArrayList<String>();
	
	list1.add("kamini");
	list1.add("john");
	list1.add("ujval");
	list1.add("sandhya");
	
	System.out.println("the list is " +list1);
	System.out.println("the list is " +list1.size());
	System.out.println("the first name of list is " +list1.get(0));
	System.out.println("the last name of list is " +list1.get(list1.size()-1));
	
	list1.set(1, "kimi");
	System.out.println("the list after updating kamini " +list1);
	
	list1.remove(2);
	System.out.println("the list after deleting Leena " +list1);
	
	
	//iterate thorough the list//
	
	for(int i=0;i<list1.size();i++) {
		
		System.out.println("ELEMENT NAME " +list1.get(i));
	}
	for(String value:list1) {
		System.out.println("elecment value " +value);
	}
	
	Iterator<String> itr = list1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	Collections.sort(list1);
	System.out.println("after sorting the list  " +list1);
	
	Collections.sort(list1, Collections.reverseOrder());
	System.out.println("reverese the string " +list1);
	
	}
}
