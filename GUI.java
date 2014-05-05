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
				System.out.println(choices.getSelection());
				if(choices.getSelection().equals(rockButton.getModel())){
					Choice aChoice = new Choice(Hand.ROCK);
				} else if(choices.getSelection().equals(paperButton.getModel())){
					//make paper hand
					//LeftOFFHERE
					///
					///LEFT OFF HERE
					///
					Choice aChoice = new
				} else if(choices.getSelection().equals(scissorButton.getModel())){
					//make scissor hand
				} else if(choices.getSelection().equals(lizardButton.getModel())){
					//make lizard hand
				} else if(choices.getSelection().equals(spockButton.getModel())){
					//make spock hand
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