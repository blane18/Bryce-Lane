class runLength 
{
	public String Length(String str)
	{
		String input = "AAABBBBC";
		
		int count = 0;
		
		char ex = str.charAt(0);
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ex)
				count++;
			
			else
			{
				input = input + str.charAt(i);
			}
		}
		
		return input;
	}
		
		
		
		public static void main(String[] v)
		{
			runLength tester = new runLength();
			String testOne = tester.Length("AAABBBBC");
			System.out.println(testOne);
		
		
		
		}
		
		
		
		//public String runLengthChecker(String , String)
		
			
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
