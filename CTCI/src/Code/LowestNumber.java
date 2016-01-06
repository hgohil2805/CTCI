package Code;

public class LowestNumber 
{
	public String lowestNum(String s, int n,String sub)
	{
		System.out.println("Current string is : " +s);
		System.out.println("Current n is : "+n);
		System.out.println("Current sub string is: "+sub);
		if(n == 0)
		{
			sub+= s;
			return sub;
		}
		else
		{
			int len = s.length();
			if(len <=n)
				return s;
			int min = Character.getNumericValue(s.charAt(0));
			int index = 0;
			for(int i=0;i<n;i++)
			{
				if(Character.getNumericValue(s.charAt(i)) < min)
				{
					min = Character.getNumericValue(s.charAt(i));
					index = i;
				}
			}
			sub += s.charAt(index);
			String sub_string = s.substring(index +1, len - index);
			lowestNum(sub_string,n-index,sub);
		}
		return sub;
	}
	public static void main(String[] args) 
	{
		String input = "12345";
		LowestNumber obj = new LowestNumber();
		
		System.out.println(obj.lowestNum(input, 3, ""));
		

	}

}
