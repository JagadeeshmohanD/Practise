
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="hello";//String literal immutable not alterable
		String b ="hello"; //b reference variable so immutable
		String c=a.concat("World");
		System.out.println(c);
		String s=new String("Hello");//memory 1 mutable alter
		String s1=new String("hello");//memory 2 mutable alter
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//Referring to same object
		System.out.println(a.equalsIgnoreCase(s));//equals operator checks for content true
        System.out.println(a==s);//fail
        System.out.println(s==s1);//fails references are different
		//string buffer and stringBuilder
		StringBuffer sb = new StringBuffer("hello");
		sb.append("World");
		System.out.println(sb);
		sb.insert(2, "She"); //HeShelloWorld
		System.out.println(sb);
		sb.replace(5, 7, "aa");//HeSheaaoWorld
		System.out.println(sb);
		sb.delete(5, 7);//HeSheoWorld
		System.out.println(sb);
		sb.deleteCharAt(5);//HeSheWorld
		System.out.println(sb);
		sb.reverse();//dlroWehSeh
		System.out.println(sb);
		
		StringBuilder sbb = new StringBuilder("Hello");
		System.out.println(sbb);
		
		
		
		

	}

}
