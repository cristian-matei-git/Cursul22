package tema3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class BigNumbers {
	
	
	public LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
		  
		  if (op1.size() > op2.size()) {
		    	
		      LinkedList<Integer> vAux = op1;
		      op1 = op2;
		      op2 = vAux;
		      
		  }
		  
		  LinkedList<Integer> result = new LinkedList<Integer>();
		  
		  ListIterator<Integer> it1 = op1.listIterator(op1.size());
		  ListIterator<Integer> it2 = op2.listIterator(op2.size());
		  
		  int remainder = 0;
		  
		  
		  while(it1.hasPrevious()) {
			  
			  int digSum = it1.previous() + it2.previous() + remainder;
		      remainder = digSum / 10;
		      result.addFirst(digSum % 10);
		      
		  }
		  
		  while(it2.hasPrevious()) {
		    	
		    	
		      int digSum = it2.previous() + remainder;
		      result.addFirst(digSum % 10);
		      remainder = digSum / 10;
		     
		      
		  }
		  if (remainder != 0) {
		    	
		      result.addFirst(remainder);
		      
		  }
		  return result;
	}
	 
	public static void main(String[] args) {
	    System.out.println("Checking input...");
	 
	    Integer[] op1 = new Integer[] {5, 5, 0, 5, 0};
	    Integer[] op2 = new Integer[] {5, 0, 5, 0, 5};
	    LinkedList<Integer> operand1 = new LinkedList<Integer>(Arrays.asList(op1));
	    LinkedList<Integer> operand2 = new LinkedList<Integer>(Arrays.asList(op2));
	    BigNumbers bn = new BigNumbers();
	    LinkedList<Integer> rez = bn.sum(operand1, operand2);
	    int[] correct = {1, 0, 5, 5, 5, 5};
	    System.out.println(operand1 + " + " + operand2 + 
	                       " = " + rez + " Corect: " + noToString(correct));
	}
	 
    private static String noToString(int[] no) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i = 0; i < no.length; i++) {
    		
    		sb.append(no[i]);
    		
    	}
    	
    	return sb.toString();
    }

}
