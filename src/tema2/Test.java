package tema2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
	
	public static void removeDuplicates(LinkedList<Integer> l1) {
		
		ListIterator<Integer> it = l1.listIterator();
		
		while(it.nextIndex() < l1.size() - 1) {
			
				
			if(it.next() == it.next()) {
				
				it.remove();
				
			}
			it.previous();
		}
		
	}
	
	public static void removeDuplicates2(LinkedList<Integer> l1) {
		
		ListIterator<Integer> it = l1.listIterator();
		int a = 0;
		int b = 0;
		while(it.nextIndex() < l1.size() - 1) {
			
			a = it.next();
			b = it.next();
				
			if(a == b) {
				
				it.remove();
				
				if(a == l1.get(it.nextIndex()) && a != l1.get(it.nextIndex() + 1)) {
					it.next();
					it.remove();
				}
				
				it.previous();
				it.remove();
				
				
			}
			
			it.previous();
			
		}
		
		
		
	}

	public static void main(String[] args) {


		LinkedList<Integer> test = new LinkedList<>();
		
		test.add(1);
		test.add(2);
		test.add(2);
		test.add(2);
		test.add(2);
		test.add(9);
		test.add(9);
		test.add(9);
		test.add(10);
		test.add(10);
		test.add(14);
		test.add(40);
		test.add(46);
		
		LinkedList<Integer> test2 = new LinkedList<Integer>();
		
		test2.add(1);
		test2.add(2);
		test2.add(2);
		test2.add(2);
		test2.add(2);
		test2.add(9);
		test2.add(9);
		test2.add(9);
		test2.add(10);
		test2.add(10);
		test2.add(14);
		test2.add(40);
		test2.add(46);
		
		System.out.println("The list: " + test);
		
		removeDuplicates(test);
		System.out.println("The list after removing duplicates: " + test);
		
		removeDuplicates2(test2);
		System.out.println("The list after removing all duplicates: " + test2);

	}

}
