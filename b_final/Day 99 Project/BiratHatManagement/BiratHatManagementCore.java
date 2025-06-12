import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BiratHatManagementCore extends JFrame implements MouseListener	{
	ImageIcon img1, img2, img3, img4;
	JLabel goruLabel, chagolLabel, camelLabel, imgLabel1, imgLabel2, imgLabel3, goruPriceLabel, chagolPriceLabel, camelPriceLabel;
	JTextField goruTF, chagolTF, camelTF;
	JTextArea hasilArea;
	JButton clearBtn, cartBtn, purchaseBtn;
	JScrollPane scrollPane;
	JPanel panel;
	
	public BiratHatManagementCore()	{
		super("Goru Chagol er Birat Hat Sales Management");
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		ImageIcon originalIcon = new ImageIcon("Images/Goru.jpg");
		Image scaledImage = originalIcon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		img1 = new ImageIcon(scaledImage);
		imgLabel1 = new JLabel(img1);
		imgLabel1.setBounds(-10, -10, 200, 200);
		panel.add(imgLabel1);
		
		goruLabel = new JLabel("Goru Quantity");
		goruLabel.setBounds(165, 50, 100, 30);
		panel.add(goruLabel);
		
		goruTF = new JTextField();
		goruTF.setBounds(165, 80, 100, 30);
		panel.add(goruTF);
		
		goruPriceLabel = new JLabel("Price: 10,00000 Taka");
		goruPriceLabel.setBounds(33, 145, 160, 30);
		panel.add(goruPriceLabel);
		
		
		ImageIcon originalIcon = new ImageIcon("Images/Chagol.jpg");
		Image scaledImage = originalIcon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		img2 = new ImageIcon(scaledImage);
		imgLabel2 = new JLabel(img2);
		imgLabel2.setBounds(-10, -10, 200, 200);
		panel.add(imgLabel2);
		
		goruLabel = new JLabel("Goru Quantity");
		goruLabel.setBounds(165, 50, 100, 30);
		panel.add(goruLabel);
		
		goruTF = new JTextField();
		goruTF.setBounds(165, 80, 100, 30);
		panel.add(goruTF);
		
		goruPriceLabel = new JLabel("Price: 10,00000 Taka");
		goruPriceLabel.setBounds(33, 145, 160, 30);
		panel.add(goruPriceLabel);
		
		
		this.add(panel);
		this.setLocationRelativeTo(null);
	}
	
		
		public void mouseClicked(MouseEvent me){}
		public void mousePressed(MouseEvent me){}
		public void mouseReleased(MouseEvent me){}
		public void mouseEntered(MouseEvent me){}
		public void mouseExited(MouseEvent me){}
}

