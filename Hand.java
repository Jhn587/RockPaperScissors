public enum Hand{
	
	ROCK,
	PAPER,
	SCISSORS,
	SPOCK,
	LIZARD
	
	
	public int compareTo(E other){
		int toReturn = 0;
		switch(other){
			case ROCK:
				switch(this){
					case ROCK:
					toReturn = 0;
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
					toReturn = -1;
					break;
		
				}
				break;
			//LEFT OFF HERE
			case PAPER:
				break;
				
			case SCISSORS:
				break;
				
			case SPOCK:
				break;
				
			case LIZARD:
				break;
		
		}
	
	}


}