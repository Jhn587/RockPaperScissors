public class Choice implements Comparable{
	//Look up enums for the choice
	Hand aHand;
	
	public Choice(Hand aHand){
		this.aHand = aHand;
	
	}
	
	public int compareTo(){
	
	
	}
	
	public boolean equals(Object toCheck){
		if(this== toCheck){
			return true;
		}
		if(!(toCheck instanceof Choice)){
			return false;
		}
		//Left off here
		
		
	
	}



}