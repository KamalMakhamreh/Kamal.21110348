import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame {

	Frame () {
		 JFrame frame = new JFrame();
		    frame.setSize(600,700);
		    frame.setVisible(true);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    Font font = new Font ("Arial", Font.BOLD,16);
		    frame.setTitle("Welcome to the HTU university website where you can see all off it's buildings");
		    JButton button1= new JButton("Overview");
    		button1.setBounds(50,150,150,100);
    		button1.setFont(font);
    		button1.setForeground (Color .black);
    		button1.setBackground(Color .black);
    		frame.add(button1);
    		JButton button2= new JButton("Red Gate");
    		button2.setBounds(350,150,150,100);
    		button2.setFont(font);
    		button2.setForeground (Color .black);
    		button2.setBackground(Color .red);
    		frame.add(button2);
    		JButton button3= new JButton("Blue Gate");
    		button3.setBounds(50,350,150,100);
    		button3.setFont(font);
    		button3.setForeground (Color .black);
    		button3.setBackground(Color .blue);
    		frame.add(button3);
    		JButton button4= new JButton("Yellow Gate");
    		button4.setBounds(350,350,150,100);
    		button4.setFont(font);
    		button4.setForeground (Color .black);
    		button4.setBackground(Color .yellow);
    		frame.add(button4);
  
    		button1.addMouseListener(new MouseListener() {
 	   	    	public void MouseListener(MouseEvent e) {
 	   	    		
 	   	    	}

 	   			@Override
 	   			public void mouseClicked(MouseEvent e) {
 	   				Image2 a = new Image2();
 	   				frame.hide();
 	   				
 	   			}

 	   			@Override
 	   			public void mousePressed(MouseEvent e) {
 	   					
 	   			}

 	   			@Override
 	   			public void mouseReleased(MouseEvent e) {
 	   			
 	   			}

 	   			@Override
 	   			public void mouseEntered(MouseEvent e) {
 	   	
 	   			}

 	   			@Override
 	   			public void mouseExited(MouseEvent e) {
 	   				
 	   			}
 	   	    });
    		button2.addMouseListener(new MouseListener() {
 	   	    	public void MouseListener(MouseEvent e) {
 	   	    		
 	   	    	}

 	   			@Override
 	   			public void mouseClicked(MouseEvent e) {
 	   			Image3 b= new Image3();
 	   				frame.hide();
 	   				
 	   			}

 	   			@Override
 	   			public void mousePressed(MouseEvent e) {
 	   					
 	   			}

 	   			@Override
 	   			public void mouseReleased(MouseEvent e) {
 	   			
 	   			}

 	   			@Override
 	   			public void mouseEntered(MouseEvent e) {
 	   	
 	   			}

 	   			@Override
 	   			public void mouseExited(MouseEvent e) {
 	   				
 	   			}
 	   	    });
    		button3.addMouseListener(new MouseListener() {
 	   	    	public void MouseListener(MouseEvent e) {
 	   	    		
 	   	    	}

 	   			@Override
 	   			public void mouseClicked(MouseEvent e) {
 	   			Image4 c = new Image4();
 	   				frame.hide();
 	   				
 	   			}

 	   			@Override
 	   			public void mousePressed(MouseEvent e) {
 	   					
 	   			}

 	   			@Override
 	   			public void mouseReleased(MouseEvent e) {
 	   			
 	   			}

 	   			@Override
 	   			public void mouseEntered(MouseEvent e) {
 	   	
 	   			}

 	   			@Override
 	   			public void mouseExited(MouseEvent e) {
 	   				
 	   			}
 	   	    });
    		
    		button4.addMouseListener(new MouseListener() {
 	   	    	public void MouseListener(MouseEvent e) {
 	   	    		
 	   	    	}

 	   			@Override
 	   			public void mouseClicked(MouseEvent e) {
 	   			Image1 d = new Image1();
 	   				frame.hide();
 	   				
 	   			}

 	   			@Override
 	   			public void mousePressed(MouseEvent e) {
 	   					
 	   			}

 	   			@Override
 	   			public void mouseReleased(MouseEvent e) {
 	   			
 	   			}

 	   			@Override
 	   			public void mouseEntered(MouseEvent e) {
 	   	
 	   			}

 	   			@Override
 	   			public void mouseExited(MouseEvent e) {
 	   				
 	   			}
 	   	    });
	}

}
