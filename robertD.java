import javax.swing.*;

class RobD extends JFrame
{
JPanel pnl = new JPanel();
JTextField txt1 = new JTextField( 38 ) ;
JTextArea txtArea = new JTextArea(6,37);
JScrollPane pane = new JScrollPane( txtArea ) ;

	public RobD()
	{
		super("All The Moneys");
		setSize( 600,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
		setVisible(true);
		pnl.add( txt1 ) ;
		pnl.add(pane);
	}

	public static void main ( String[] args )
	{
		RobD gui = new RobD();
	} 
		
}	
















class robertD{
	
	Moneys[] pocketChange;
	
	enum Moneys{
		penny, nickel, dime, quarter, halfdollar, dollar
	}

	public int getValue(Moneys coin){

		int value = 0;
		switch (coin){
			case penny:
				value = 1;
				break;
			case nickel:
				value = 5;
				break;
			case dime:
				value = 10;
				break;
			case quarter:
				value = 25;
				break;
			case halfdollar:
				value = 50;
				break;
			case dollar:
				value = 100;
				break;
		}

		return value;
	}
}

class dinero{
	
	public static robertD.Moneys newCoin(){
		int randomNumber;
		randomNumber = (int) (Math.random() * 6);
/*		robertD.Moneys[] randomCoin = new robertD.Moneys[]{robertD.Moneys.penny, 
														   robertD.Moneys.nickel, 
														   robertD.Moneys.dime, 
														   robertD.Moneys.quarter, 
														   robertD.Moneys.halfdollar, 
														   robertD.Moneys.dollar};*/
		return robertD.Moneys.values()[randomNumber];
	}
	
	public static void main(String... v){
		robertD Duckets = new robertD();
		
		Duckets.pocketChange = new robertD.Moneys[100];

		// give each of the coins a value		
		for(int index = 0; index < Duckets.pocketChange.length; index++){
			Duckets.pocketChange[index] = newCoin();
		}
		
		int sum=0;
		
		for(robertD.Moneys coin: Duckets.pocketChange){ 
			System.out.print(coin + " |" );
			sum += Duckets.getValue(coin);
		}
		System.out.println( );

		System.out.println("$"+(double)sum/100.00 );
		
		//Show me the coins in your pocketChange.
		
		
		//Give me the sum of those coins.
		
	}
}