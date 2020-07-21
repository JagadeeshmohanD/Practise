package coreJavaTraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List list = new ArrayList<>();
      list.add(10);
      list.add(50);
      list.add(30);
      list.add(60);
      list.add(20);
      list.add(90);
      list.add(20);
      
//      Iterator i = list.iterator();
      System.out.println("Printing Given Array..");
//      while(i.hasNext())
//      {
//    	  System.out.println(i.next());
//      }
      for(int j=0;j<list.size();j++)
      {
    	  System.out.println(list.get(j));
      }
      
      Comparator cmp = Collections.reverseOrder();
      Collections.sort(list, cmp);
      System.out.println("printing list in descending order..");
      Iterator i2 = list.iterator();
      while(i2.hasNext())
      {
    	  System.out.println(i2.next());
      }
	}

}
