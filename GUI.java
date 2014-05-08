import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

	private JFrame mainFrame = new JFrame();
	private JPanel thePanel = new JPanel();
	private ButtonGroup choices = new ButtonGroup();
	private JRadioButton rockButton = new JRadioButton("Rock", true);
	private JRadioButton paperButton = new JRadioButton("Paper");
	private JRadioButton scissorButton = new JRadioButton("Scissors");
	private JRadioButton lizardButton = new JRadioButton("Lizard");
	private JRadioButton spockButton = new JRadioButton("Spock");
	private Choice userChoice;
	private ScoreBoard theScore = new ScoreBoard();
	
	
	public GUI(){
		
		
		
		choices.add(rockButton);
		choices.add(paperButton);
		choices.add(scissorButton);
		choices.add(lizardButton);
		choices.add(spockButton);
		
		/*rockButton.addActionListener(this);
		paperButton.addActionListener(this);
		scissorButton.addActionListener(this);
		lizardButton.addActionListener(this);
		spockButton.addActionListener(this);
		*/
		JButton submit = new JButton("Submit Choice");
		//Add an inner class for the actionListener
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//an action
				
				if(choices.getSelection().equals(rockButton.getModel())){
					userChoice = new Choice(Hand.ROCK);
				} else if(choices.getSelection().equals(paperButton.getModel())){
					userChoice = new Choice(Hand.PAPER);
					
				} else if(choices.getSelection().equals(scissorButton.getModel())){
					userChoice = new Choice(Hand.SCISSORS);
				} else if(choices.getSelection().equals(lizardButton.getModel())){
					
					userChoice = new Choice(Hand.LIZARD);
				} else if(choices.getSelection().equals(spockButton.getModel())){
					userChoice = new Choice(Hand.SPOCK);
				}
				
				Random aRandom = new Random();
				Choice cpuChoice = new Choice(aRandom.nextInt(6));
				System.out.println(userChoice+" vs " +cpuChoice+ " = " + userChoice.compareTo(cpuChoice));
				
				if( userChoice.compareTo(cpuChoice)>0){
					this.theScore.userWins();
					//pop up window
				}else if(userChoice.compareTo(cpuChoice)<0){
					this.theScore.cpuWins();
					//pop up window
				}else {
				//they are equal
					this.theScore.theyTie();
					//popup window
				}
			}
		});
		
		
		
		
		thePanel.add(rockButton);
		thePanel.add(paperButton);
		thePanel.add(scissorButton);
		thePanel.add(lizardButton);
		thePanel.add(spockButton);
		
		thePanel.add(submit);
		
		mainFrame.add(thePanel);
		mainFrame.setSize(300,300);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	/*public void actionPerformed(ActionEvent e) {
		//We want to have the picture of whatever changed
	
	}*/

}