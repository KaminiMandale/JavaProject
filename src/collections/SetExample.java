package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1= new HashSet<String>();
       set1.add("jake");
       set1.add("Lily");
       set1.add("Naina");
       
       System.out.println("the set is " +set1);
       
       
       TreeSet<String> set2= new  TreeSet<String>();
       
       set2.add("ujval");
       set2.add("mangal");
       set2.add("utkrasha");
       set2.add("sonali");
       
       System.out.println(set2);
 	}

}
