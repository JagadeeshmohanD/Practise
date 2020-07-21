package coreJavaTraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class reverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
		list.add("10");
		list.add("20");
		list.add("30");
		Iterator i = list.iterator();
		System.out.println("Printing array List..");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Iterator i2 = list.iterator();
		Collections.reverse(list);
		System.out.println("Printing array List in reverse order..");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
	}

}
