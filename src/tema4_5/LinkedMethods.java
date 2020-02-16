package tema4_5;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedMethods {
	
	 public static LinkedList<Integer> mergeTwoLinkedLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
	        
		LinkedList<Integer> result = new LinkedList<>(); 	
	 	ListIterator<Integer> it1 = l1.listIterator();
	 	ListIterator<Integer> it2 = l2.listIterator();
        
        while(it1.hasNext() || it2.hasNext()){

            if(it1.hasNext() && it2.hasNext()){
            	
            	if(it1.next() <= it2.next()) {
	                result.add(it1.previous());
	                it2.previous();
	                it1.remove();
            	}
            	else {
            		it1.previous();
            		result.add(it2.previous());
            		it2.remove();
            	}
            	
            }else if(!l2.isEmpty()){

                result.add(it2.next());
                it2.remove();

            }else if(!l1.isEmpty()){

                result.add(it1.next());
                it1.remove();

            }
        }
        
        return result;
	        
	}
	 
	 public static LinkedList<Integer> rotateRight(LinkedList<Integer> li, int k) {
	       
		 
		 ListIterator<Integer> it = li.listIterator();
		 LinkedList<Integer> result = new LinkedList<>();
		 
	       if (it.hasNext()) {
	           
	            int length = 0;
	           
	            while (it.hasNext()) {
	                
	                it.next();
	                length++;
	                
	            }
	           
	            k %= length;
	            
	            if (k > 0) {
	                
	                while (k>0) {
	                    
	                    it.previous();
	                    k--;
	                    
	                }
	                
	                while(it.hasNext()) {
	                	
	                	result.add(it.next());
	                	it.remove();
	                	
	                }
	            

	            }
	            
	           
	           result.addAll(li);
	            
	            
	        }
	        
	        return result;
	        
	    }

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		LinkedList<Integer> l3 = new LinkedList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(4);
		l1.add(7);
		
		l2.add(1);
		l2.add(3);
		l2.add(4);
		
		l3.add(1);
		l3.add(2);
		l3.add(3);
		l3.add(4);
		
		System.out.println(mergeTwoLinkedLists(l1, l2));
		System.out.println(rotateRight(l3, 5));
		
	}

}
