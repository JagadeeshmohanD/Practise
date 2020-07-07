
public class reversedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pallandrom ex:-madam
		String a ="madam";
		String r =" ";
		for(int i=a.length()-1;i>=0;i--) {
			r = r+a.charAt(i);
		}
		System.out.println(r);
	}

}
