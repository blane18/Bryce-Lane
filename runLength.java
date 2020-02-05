class runLength 
{
	public String Length(String str)
	{
		String input = "AAABBBBC";
		
		int count = 0;
		
		char ex = input.charAt(0);
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==ex)
				count++;
			
			else
			{
				System.out.print(count+""+ex);
				count = 1;
				ex = input.charAt(i);
			}
		}
		return(ex+""+count);
	}
		
		
		
		public static void main(String[] v)
		{
			runLength tester = new runLength();
			String testOne = tester.Length("AAABBBBC");
			System.out.println(testOne);
		
		
		
		}
		
		
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//public String runLengthChecker(String , String)