package tema1;

import tema1.OrderedList;

public class TestOrderedList {
	  public static void main(String[] args) {
	 
	    OrderedList<Town> orderedTownsList = new OrderedList<>();
	    
	    //create towns
	    Town t1 = new Town("Timisoara", 100);
	    Town t2 = new Town("Arad", 150);
	    Town t3 = new Town("Bucuresti", 0);
	    Town t4 = new Town("Ploiesti", 30);
	    
	    // populate list with towns:
	    orderedTownsList.addInOrderedList(t1);
	    orderedTownsList.addInOrderedList(t2);
	    orderedTownsList.addInOrderedList(t3);
	    orderedTownsList.addInOrderedList(t4);
	 
	    System.out.println(orderedTownsList);
	  }
	}