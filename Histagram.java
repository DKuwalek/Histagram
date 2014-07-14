public class Histagram{
	
	public static void main(String[] args){
	
		Histagram Toblerone = new Histagram();
		Toblerone.run(10, 'A', ' ');
	
	}
	
	public void run(int height, char sign, char spacing){
		
		//Fields
		//rowLength = Number of signs in every line
		int rowLength = 2 * height - 1;
		
		////
		//Giving out passed info
		System.out.println("Height given: "  + height);
        System.out.println("sign given: "    + sign);
        System.out.println("spacing with: "  + spacing);
		//System.out.println("Sign counter = " + rowLength);
		
		//Main loop - height times
        System.out.println("Entering main loop");		
		for (int a = 1; a <= height; a++)
		{
			int signsInRow = 2 * a - 1;
			int spacingsInRow = rowLength - signsInRow;
			//System.out.println("height= " + a);
			
			//printing chosen white spacings - left half of it
			for (int b = 1; b <= spacingsInRow / 2 ; b++)
			{
		        //System.out.println("inside loop b= " + b + "\nspacings in row / 2 =" + (spacingsInRow / 2));
				System.out.print(spacing);
			}
			//printing chosen sign - all of it
			for (int z = 1; z <= signsInRow; z++)
			{
				System.out.print(sign);
			}
			//printing chosen white spacings - right half of it
			for (int c = 1; c <= spacingsInRow / 2; c++)
			{
		        System.out.print(spacing);
			}						
			//Switching to the next row
			System.out.println();
			
		}
	
	}
	
}