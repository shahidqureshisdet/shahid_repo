package ddt;

public class Runner_Excel 
{
	public static void main(String[] args) 
	{	
		String username=Generic_Script.get_Data("Sheet1", 1, 0);
		String pass=Generic_Script.get_Data("Sheet1", 1, 1);
		System.out.println(username);
		System.out.println(pass);
		
	}

}
