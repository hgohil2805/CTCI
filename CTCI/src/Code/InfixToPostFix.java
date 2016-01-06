package Code;
import java.util.Stack;


public class InfixToPostFix 
{
	public int getPrecedence(char a)
	{
		switch(a)
		{
		case '*' : 
			return 2;
		case '/':
			return 2;
		case '+' :
			return 1;
		case '-':
			return 1;
		default :
			return 0;
		}
	}
	
	public String toPostFix(String s)
	{
		String a = "";
		Stack<Character> operator = new Stack<Character>();
		for(int i = 0; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				a += "" +ch;
			}
			else
			{
				while(!operator.isEmpty() && getPrecedence(operator.peek()) > getPrecedence(ch))
				{
					a += operator.pop() +"";
				}
				operator.push(ch);
			}
		}
		while(!operator.isEmpty())
		{
			a += operator.pop();
		}
		return a;
	}
	public static void main(String[] args) 
	{
		String a  = "2*3-4/5";
		InfixToPostFix obj = new InfixToPostFix();
		System.out.println(obj.toPostFix(a));
	}

}
