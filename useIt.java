class Xamples{
	

	public String ShowYours() {
		return "";
	}
	
	public String ShowMine() {
		return "b";
	}
	
	public int ShowYours(String C) {
		return 4;
	}
	
	public int ShowMine(String D) {
		return 5;
	}
	
	public double ShowYours(int C) {
		return 2.22;
	}
	
	public double ShowMine(int D) {
		return 2.23;
	}

}
class useIt {
	
	
	Xamples iWill = new Xamples();
	
	 
	/*int saveInt = 0;
	String SaveString = "testing";
	double SaveDouble = 42.42;
	*/
	String X = iWill.ShowMine();
		
	String SaveString = iWill.ShowYours();
		
	
	int YX = iWill.ShowMine("i'm telling mom");
		
	
	int saveInt = iWill.ShowYours("ok");
		
	
	double SaveDouble = iWill.ShowMine(42);
		
		
	double Weird = iWill.ShowYours(24);
		
	
	public static void main(String[] args){
	System.out.println(" ");
	
	
	
	}
}