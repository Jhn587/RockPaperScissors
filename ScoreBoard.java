public class ScoreBoard{

	private int cpuWins = 0;
	private int userWins = 0;
	private int theyTie = 0;
	private int gamesPlayed = 0;
	
	public ScoreBoard(){
	
	}
	
	public void userWins(){
		this.userWins++;
		this.gamesPlayed++;
	}
	
	public void cpuWins(){
		this.cpuWins++;
		this.gamesPlayed++;
	}
	
	public void theyTie(){
		this.theyTie++;
		this.gamesPlayed++;
	}
	
	public int getGamesPlayed(){
		return this.gamesPlayed;
	
	}
	
	public int getCPUWins(){
		return this.cpuWins;
	
	}
	
	public int getUserWins(){
		return this.userWins;
	
	}
}