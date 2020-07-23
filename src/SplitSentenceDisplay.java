
public class SplitSentenceDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a ="GE HEALTHCARE IS A MEDICAL DEVICES COMPANY";
		 String[] split=a.split(" ");
		 String reverse=" ";
		 for(int i=0;i<=split.length-1;i++) {
			 reverse+=(split[i]+" ");
			 System.out.println(split[i]);
		 }
		 System.out.println(reverse.trim());
	}
}
