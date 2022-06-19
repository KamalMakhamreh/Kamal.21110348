	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
public class main {

	
		

	public static void main(String[] args) {
			
			 JFrame frame = new JFrame();
			    frame.setSize(600,700);
			    frame.setVisible(true);
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    Font font = new Font ("Arial", Font.BOLD,16);
			    		JButton button_1= new JButton("Click Me To Start");
			    		button_1.setBounds(170,270,170,50);
			    		button_1.setFont(font);
			    		button_1.setForeground (Color .white);
			    		button_1.setBackground(Color .black);
			    		 
		 	    		frame.add(button_1);
    
		 	    	    button_1.addMouseListener(new MouseListener() {
		 	   	    	public void MouseListener(MouseEvent e) {
		 	   	    		
		 	   	    	}

		 	   			@Override
		 	   			public void mouseClicked(MouseEvent e) {
		 	   			Frame f =new Frame();
		 	   		    frame.hide();
		 	   				
		 	   			}

		 	   			@Override
		 	   			public void mousePressed(MouseEvent e) {
		 	   				// TODO Auto-generated method stub
		 	   				
		 	   			}

		 	   			@Override
		 	   			public void mouseReleased(MouseEvent e) {
		 	   				// TODO Auto-generated method stub
		 	   				
		 	   			}

		 	   			@Override
		 	   			public void mouseEntered(MouseEvent e) {
		 	   				// TODO Auto-generated method stub
		 	   				
		 	   			}

		 	   			@Override
		 	   			public void mouseExited(MouseEvent e) {
		 	   				// TODO Auto-generated method stub
		 	   				
		 	   			}
		 	   	    });
	}

}
