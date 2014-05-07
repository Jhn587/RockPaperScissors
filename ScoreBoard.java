public class ScoreBoard{

	private int cpuWins = 0;
	private int userWins = 0;
	private int gamesPlayed = 0;
	
	public ScoreBoard(){
	
	}
	
	public int userWins(){
		this.userWins++;
		this.gamesPlayed++;
	}
	
	public int cpuWins(){
		this.cpuWins++;
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