package Code;
import java.lang.reflect.*;
public class ReflectionExample 
{

	public static void main(String[] args)
	{
		Class c = null;
		try 
		{
			c = Class.forName("java.sql.Connection");
		} catch (ClassNotFoundException e) 
		{
			
			System.out.println("Class not found");
		}
		
		Method m[] = c.getDeclaredMethods();
		
		for(int i = 0;i < m.length;i++)
		{
			System.out.println(m[i].toString());
		}
	}

}
