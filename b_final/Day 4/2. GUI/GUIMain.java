import java.awt.*;
import javax.swing.*;

public class GUIMain extends JFrame	{
	JPanel panel;
	JLabel nameLabel, usernameLabel, passwordLabel;
	JTextField name, username;
	JPasswordField passwordField;
	JButton exitButton, submitButton;
	JCheckBox checkBox1, checkBox2, checkBox3;
	JRadioButton radioButton1, radioButton2, radioButton3;
	
	public GUIMain()	{
		super("My First GUI");
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(150, 115, 100, 30);
		panel.add(nameLabel);
		
		usernameLabel = new JLabel("Username: ");
		usernameLabel.setBounds(150, 135, 100, 30);
		panel.add(usernameLabel);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(150, 155, 100, 30);
		panel.add(passwordLabel);
		
		this.add(panel);
	}
}
