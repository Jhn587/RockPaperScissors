import java.swingx.*;

public class GUI {

	public GUI(){
		JFrame mainFrame = new JFrame();
		JPanel thePanel = new JPanel();
		JRadioButton rockButton = new JRadioButton("Rock");
		JRadioButton paperButton = new JRadioButton("Paper");
		JRadioButton scissorButton = new JRadioButton("Scissors");
		JRadioButton lizardButton = new JRadioButton("Lizard");
		JRadioButton spockButton = new JRadioButton("Spock");
		
		ButtonGroup choices = new ButtonGroup();
		choices.add(rockButton);
		choices.add(paperButton);
		choices.add(scissorsButton);
		choices.add(lizardButton);
		choices.add(spockButton);
		
		rockButton.addActionListener(this);
		paperButton.addActionListener(this);
		scissorButton.addActionListener(this);
		lizardButton.addActionListener(this);
		spockButton.addActionListener(this);
		
		JButton submit = new JButton("Submit Choice");
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//We want to have the picture of whatever changed
	
	}

}