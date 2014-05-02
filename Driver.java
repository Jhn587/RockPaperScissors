public class Driver{

	public static void main(String[] args){
		new GUI();
		
		//testing enum
		System.out.println("Scissors cut paper "+Hand.Scissor.compareTo(Hand.paper));
	
	}

}