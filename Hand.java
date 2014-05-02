public enum Hand{
	
	ROCK,
	PAPER,
	SCISSORS,
	SPOCK,
	LIZARD;
	
	
	public int compareTo(Hand other){
		int toReturn = 0;
		switch(other){
			case ROCK:
				switch(this){
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
				switch(this){
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
				switch(this){
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
				switch(this){
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
				switch(this){
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
	
	}


}