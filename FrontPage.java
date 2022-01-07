
import javax.print.attribute.standard.Media;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

 public class FrontPage extends JFrame implements ActionListener
{
	 JLabel encypt,decrypt,he;
	JFrame f;
	JButton create,en,de;
		public FrontPage()
	{ 
		setTitle("farmer buddy");
		 setVisible(true);setSize(800,600);
		 setLayout(new BorderLayout()); 
			JLabel background=new JLabel(new ImageIcon("D:\\stego.jpeg"));
			add(background);
			background.setLayout(new FlowLayout());
			
		create=new JButton("CLICK ME ");
		 setVisible(true);
		create.addActionListener(this);
		create.setBackground(Color.WHITE);
	background.add(create);
         create.setBounds(300,330,200, 50); he =new JLabel("welcome\n watch this video for handling application");
         setVisible(true);
       he.setBackground(Color.WHITE);
         he.setBounds(100, 100, 200, 25);
       
		en=new JButton(" https://drive.google.com/file/d/1_79OsTLmcAFSvNAp05ALulFYUlCQSAox/view?usp=sharing");
		 setVisible(true);
		en.addActionListener(this);
		en.setBackground(Color.WHITE);
	
         en.setBounds(100,200,200, 50);
         encypt =new JLabel("encrypt /sending");
         setVisible(true);
       encypt.setBackground(Color.WHITE);
         encypt.setBounds(100, 300, 200, 25);
         de=new JButton(" ");
		 setVisible(true);
			de.addActionListener(this);
			de.setBackground(Color.WHITE);
	
	         de.setBounds(400,200,200, 50);
	          decrypt =new JLabel("decrypt /recieve");
	         setVisible(true);
	        decrypt.setBackground(Color.WHITE);
	         decrypt.setBounds(400, 300, 200, 25);
         
	}
		
 	public void actionPerformed(ActionEvent e)
	{ if(e.getSource()== create)
		{new signUp();dispose();
		}
	}
 		public static void main(String args[])
	{	new FrontPage();
	
	}
}
