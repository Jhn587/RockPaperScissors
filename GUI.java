import javax.swing.*;
imprt java.awt.event.ActionEvent;

public class GUI {

	public GUI(){
		JFrame mainFrame = new JFrame();
		JPanel thePanel = new JPanel();
		JRadioButton rockButton = new JRadioButton("Rock", true);
		JRadioButton paperButton = new JRadioButton("Paper");
		JRadioButton scissorButton = new JRadioButton("Scissors");
		JRadioButton lizardButton = new JRadioButton("Lizard");
		JRadioButton spockButton = new JRadioButton("Spock");
		
		ButtonGroup choices = new ButtonGroup();
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
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//an action
				System.out.println(choices.getSelection());
				if(choices.getSelection().equals(rockButton.getModel())){
					//make rock hand
				} else if(choices.getSelection().equals(paperButton.getModel())){
					//make paper hand
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