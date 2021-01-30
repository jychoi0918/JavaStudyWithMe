package ggomi.com.gui;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class guiEx1 {

	//This is my GUI practice code. Actually, I don't know how much it is important or not.
	// But at least I should try this one out on my curriculum so let's start it!
	
	public static void main(String[] args) {
	JFrame frame = new JFrame("Best PROGRAM IN THE WORLD"); // set a frame and a title
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //able to close Button
	frame.setSize(600,500);
	frame.setResizable(true);  //resize the Frame
	frame.getContentPane().setBackground(new Color(104,95,44)); // RGB color
	
	ImageIcon image = new ImageIcon("d:\\\\image\\stitch.jpg"); //write the path of the icon
	frame.setIconImage(image.getImage()); 	           //set it on the frame
	ImageIcon image1 = new ImageIcon("d:\\image1\\pnga.png");
	JLabel label = new JLabel("Ich bin traurig!",image,JLabel.CENTER); //1. string of text 2.image 3.Labels location
//	label.setVerticalAlignment(JLabel.BOTTOM);
//	label.setHorizontalAlignment(JLabel.RIGHT);
	label.setVerticalTextPosition(JLabel.TOP);
	label.setHorizontalTextPosition(JLabel.CENTER);
	label.setForeground(new Color(10,30,60));     //set color of Text
	label.setFont(new Font("MV Boli",Font.ITALIC,25)); //face of Text, features , size
	
	//if you set location's Label, it will move relative to container.
	
	frame.add(label);
	
	
	
	frame.setVisible(true);  //if this line is written before the add, than that function will
							//not appear on the frame
	}
}
