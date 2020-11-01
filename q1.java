import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(),t="";
		StringBuilder st=new StringBuilder(s);
		int i;
		s=s.toUpperCase();
		for( i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='G')
				st.setCharAt(i,'C');
			else if(s.charAt(i)=='C')
				st.setCharAt(i,'G');
			else if(s.charAt(i)=='T')
				st.setCharAt(i,'A');
			else if(s.charAt(i)=='A')
				st.setCharAt(i,'U');
			else
				break;
		}
		
		if(i==s.length())
			System.out.println(st);
		else 
		{	System.out.println("Invalid Input");
			
		}
	}

}
