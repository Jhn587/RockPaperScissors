public class Choice implements Comparable{
	//Look up enums for the choice
	Hand aHand;
	
	public Choice(Hand aHand){
		this.aHand = aHand;
	
	}
	
	public int compareTo( Object other){
		
		Choice anOther = (Choice) other;
		
		int toReturn = 0;
		switch(anOther.aHand){
			case ROCK:
				switch(this.aHand){
					case ROCK:
					toReturn = 0;
					break;
					
					case PAPER:
					toReturn = 1;
					break;
					
					case SCISSORS:
					toReturn = -1;
					break;
				
					case SPOCK:
					toReturn = 1;
					break;
				
					case LIZARD:
					toReturn = -1;
					break;
		
				}
				break;
			//LEFT OFF HERE
			case PAPER:
				switch(this.aHand){
					case ROCK:
					toReturn = -1;
					break;
					
					case PAPER:
					toReturn = 0;
					break;
					
					case SCISSORS:
					toReturn = 1;
					break;
				
					case SPOCK:
					toReturn = -1;
					break;
				
					case LIZARD:
					toReturn = 1;
					break;
		
				}
				
				break;
				
			case SCISSORS:
				switch(this.aHand){
					case ROCK:
					toReturn = 1;
					break;
					
					case PAPER:
					toReturn = -1;
					break;
					
					case SCISSORS:
					toReturn = 0;
					break;
				
					case SPOCK:
					toReturn = 1;
					break;
				
					case LIZARD:
					toReturn = -1;
					break;
		
				}
				break;
				
			case SPOCK:
				switch(this.aHand){
					case ROCK:
					toReturn = -1;
					break;
					
					case PAPER:
					toReturn = 1;
					break;
					
					case SCISSORS:
					toReturn = -1;
					break;
				
					case SPOCK:
					toReturn = 0;
					break;
				
					case LIZARD:
					toReturn = 1;
					break;
		
				}
				break;
				
			case LIZARD:
				switch(this.aHand){
					case ROCK:
					toReturn = 1;
					break;
					
					case PAPER:
					toReturn = -1;
					break;
					
					case SCISSORS:
					toReturn = 1;
					break;
				
					case SPOCK:
					toReturn = -1;
					break;
				
					case LIZARD:
					toReturn = 0;
					break;
		
				}
				break;
		
		}
	
	
		return toReturn;
	}
	
	public boolean equals(Object toCheck){
		if(this== toCheck){
			return true;
		}
		if(!(toCheck instanceof Choice)){
			return false;
		}
		//Left off here
		
		Choice toCheckChoice = (Choice) toCheck;
		
		if(this.compareTo(toCheckChoice) == 0){
			return true;
		}else {
			return false;
		}
		
		
	
	}

	public String toString(){
		return this.aHand.toString();
	
	}

}