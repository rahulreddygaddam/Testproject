package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {
	
public static void main(String args[])
{
	LinkedList<String> list= new LinkedList<String>();
	{
		list.add("sri");
		list.add("10");
		list.add("nzb");
		list.add("latha");
		list.removeLast();
		list.add("last");
		list.add("latha");
		list.addLast("eeshan");
		list.getFirst();
		list.getLast();
		list.addFirst("CHINNU");
		list.size();
		list.iterator();
		list.isEmpty();
		
		
		
		 System.out.println("Final Content: " +list); 
		ListIterator<String> i= list.listIterator();
		
		
		  System.out.println("forword direction");
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			System.out.println("backword direction");
			while(i.hasPrevious())
			{
				System.out.println(i.previous());
			}
			
			
	}
	
	
	
		}
	
}
