
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
 public class mainPage extends JFrame implements ActionListener
{
	JFrame f;
	JLabel im,ing;
	JButton encrypt,decrypt;
	 
		public mainPage()
	{ 
		setLayout(new BorderLayout());
		JPanel p=new JPanel(); 
		 add(p,BorderLayout.CENTER);
			f=new JFrame("main page");f.setTitle("steganography");
		 setVisible(true);setSize(400,400);
		
		 encrypt=new JButton("encrypt");
		 setVisible(true);
		 encrypt.addActionListener(this);
		
		encrypt.setBackground(Color.WHITE);
	     
		decrypt=new JButton("click here");
		 setVisible(true);
		 decrypt.addActionListener(this);
		 decrypt.setBackground(Color.WHITE);
	     
	p.add(decrypt);
	 
	 Insets in=p.getInsets();
	      Dimension size=encrypt.getPreferredSize();
	      encrypt.setBounds(50, 100,500, 20);
	      size=decrypt.getPreferredSize();
	      decrypt.setBounds(50,200,500, 20);
	      
	      

	    }
		
 	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==decrypt)
		{	TransmitWindow tr=new TransmitWindow();
		
		}
	}
 public static void main(String args[])
	{new mainPage();
	}
}