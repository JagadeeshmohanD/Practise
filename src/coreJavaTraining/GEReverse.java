package coreJavaTraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GEReverse {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("GE");
		list.add("HEALTHCARE");
		list.add("IS");
        list.add("A");
        list.add("MEDICAL");
        list.add("DEVICES");
        list.add("COMPANY");
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
