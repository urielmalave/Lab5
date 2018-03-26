package classes;

public class SymmetricStringAnalyzer {
	private String s; 
	public SymmetricStringAnalyzer(String s) {
		this.s = s; 
	}
	
	/**
	 * Determines if the string s is symmetric
	 * @return true if it is; false, otherwise. 
	 */
	public boolean isValidContent() { 
		// ADD MISSING CODE
		SLLStack<Character> stack = new SLLStack<Character>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(Character.isLetter(c))
				if(Character.isUpperCase(c))
					stack.push(c);
				else if(stack.isEmpty())
						return false;
					 else {
						 char t = stack.top();
						 if (t==Character.toUpperCase(c))
							 stack.pop();
						 else
							 return false;
					 }
			else
				return false;
		}
		if(stack.isEmpty()==false)
			return false;
		return true;  // need to change if necessary....
	}
	
	public String toString() { 
		return s; 
	}

	public String parenthesizedExpression() 
	throws StringIsNotSymmetricException 
	{
		// ADD MISSING CODE
		if(isValidContent()==false)
			throw new StringIsNotSymmetricException("String is not symmetric");
				
		String t = "";
		
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i)))
				t = t+" <"+s.charAt(i);
			else
				t = t+" "+s.charAt(i)+"> ";
		}
		return t;  // need to change if necessary....
	}

}
