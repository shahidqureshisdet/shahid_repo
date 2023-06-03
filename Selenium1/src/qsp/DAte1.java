
package qsp;

import java.util.Date;

public class DAte1 
{
	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d);
		String d1=d.toString();
		System.out.println(d1);
		String d2=d1.replaceAll(":", "-");
		System.out.println(d2);
	}

}
