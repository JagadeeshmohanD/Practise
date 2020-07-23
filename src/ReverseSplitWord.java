
public class ReverseSplitWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String a ="GE HEALTHCARE IS A MEDICAL DEVICES COMPANY";
	  String[] split = a.split(" ");
	  String reverse=" ";
      for(int i=split.length-1;i>=0;i--) {
    	  reverse += (split[i] + " ");
      }
      System.out.println(reverse.trim());
	}

}
