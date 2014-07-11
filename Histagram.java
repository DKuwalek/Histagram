public class Histagram{
	
	final char JUICE='G';
	final char BOX=' ';
	
	public void run(){
		
		//Setting up height
		for(int h=1; h<5; h++){
			//Output of row width
			//System.out.println("Out" + h));
			int row=0;
			
			//Filling row
			while(row<(h)){
				System.out.print(JUICE);
				row++;
			}
			
			//Spacing for new row
			System.out.println();
		}
	
	}
	
	public static void main(String[] args){
	
		Histagram Camel = new Histagram();
		Camel.run();
	
	}


}