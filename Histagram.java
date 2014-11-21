public class Histagram{

	public static void main(String[] args)
	{
		Histagram Toblerone = new Histagram();
		Toblerone.run(10, 'A', ' ');
	}

	public void run(int height, char sign, char spacing)
	{
		//rowLength = Number of total signs in every line
		int rowLength = 2 * height - 1;

		//Showing passed info
		System.out.println("Height given:	"  + height);
		System.out.println("sign given: 	\"" + sign + "\"");
		System.out.println("spacing with: 	\"" + spacing+ "\"");

		//Main loop - height times
		for (int a = 1; a <= height; a++)
		{
			int signsInRow = 2 * a - 1;
			int spacingsInRow = rowLength - signsInRow;
			//System.out.println("height= " + a);

			//printing spacings - left half of it
			for (int b = 1; b <= spacingsInRow / 2 ; b++)
			{
				System.out.print(spacing);
			}
			
			//printing sign - all of it
			for (int z = 1; z <= signsInRow; z++)
			{
				System.out.print(sign);
			}
			
			//printing spacings - right half of it
			for (int c = 1; c <= spacingsInRow / 2; c++)
			{
				System.out.print(spacing);
			}	
			
			//Switch to the next row
			System.out.println();
			
		}//end of main loop
		
	}

}
