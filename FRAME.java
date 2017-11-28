import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
public class FRAME extends JFrame{

	private JPanel mainPanel, northPanel, southPanel, eastPanel, westPanel;
	private JButton clickMe,clickMe2,clickMe3,clickMe4,displayDialog;
	private JLabel northRegion, southRegion, eastRegion, westRegion;
	Menu M = new Menu();
	

	public FRAME(){
		
		this.setSize(400,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		northPanel = new JPanel();

		clickMe = new JButton("Menu List");
		clickMe.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "MENU");
				M.MenuList();

			}
		});
		clickMe2 = new JButton("Run Menu");
		clickMe2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "MENU");
				M.runMenu();

			}
		});

		clickMe3 = new JButton("Click Me");
		clickMe3.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "MENU");
				M.MenuList();
				M.runMenu();

			}
		});

		clickMe4 = new JButton("Click Me");
		clickMe4.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "I've been clicked");
			}
		});

		northRegion = new JLabel("North Region");
		northPanel.add(clickMe);
		northPanel.add(northRegion);

		mainPanel.add(northPanel, BorderLayout.NORTH);

		southPanel = new JPanel();

		southRegion = new JLabel("South Region");
		southPanel.add(clickMe2);
		southPanel.add(southRegion);
		mainPanel.add(southPanel, BorderLayout.SOUTH);

		eastPanel = new JPanel();

		displayDialog = new JButton("Display Dialog");
		displayDialog.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Displaying the dialog");
			}
		});

		eastRegion = new JLabel("East region");
		// eastPanel.add(displayDialog);
		eastPanel.add(clickMe3);
		eastPanel.add(eastRegion);
		mainPanel.add(eastPanel, BorderLayout.EAST);      

		westPanel = new JPanel();
		westRegion = new JLabel("West Region");
		//westPanel.add(displayDialog);
		westPanel.add(clickMe4);
		westPanel.add(westRegion);
		mainPanel.add(westPanel, BorderLayout.WEST);

		this.add(mainPanel);
		this.setVisible(true);
	}
	public static void main (String args[]){
	
		FRAME newbie = new FRAME();
	}
}
