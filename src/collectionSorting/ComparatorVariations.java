package collectionSorting;

import java.util.Comparator;

public class ComparatorVariations{}

class AgeComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		if(s1.getAge() > s2.getAge())
			return 1;
		else if(s1.getAge() < s2.getAge())
			return -1;
		else
			return 0;
	}
}

class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}

class AgeAndNameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.getAge() == s2.getAge() ? s1.getName().compareTo(s2.getName()) : s1.getAge() > s2.getAge() ? 1 : -1;
	}
}
