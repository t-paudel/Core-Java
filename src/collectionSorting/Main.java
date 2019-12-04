package collectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Haddi",28));
		list.add(new Student("Tushar",27));
		list.add(new Student("Avi",24));		
		list.add(new Student("Chuchi",27));		
		list.add(new Student("Shalini",25));
		list.add(new Student("Deepak",27));
		list.add(new Student("Aaloo",24));
		
		
		System.out.println("List before sorting");
		System.out.println(list);
		
		Collections.sort(list, new NameComparator());
		
		System.out.println("\nList after sorting by name");
		System.out.println(list);
		
		Collections.sort(list, new AgeComparator());
		
		System.out.println("\nList after sorting by age");
		System.out.println(list);
		
		Collections.sort(list, new AgeAndNameComparator());
		
		System.out.println("\nList after sorting by age and name");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("\nList after sorting by natural sorting order");
		System.out.println(list);
	}
	
}
