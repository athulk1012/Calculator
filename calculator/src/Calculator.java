import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class  Calculator implements ActionListener{
	static double a=0,b=0,result=0;
	static int operator=0;
	JFrame jf;
	JLabel displaylabel;
	JButton seven,eight,nine;
	JButton four,five,six,one,two,three;
	JButton dot,zero,equal,div,multy,add,sub,clear;
	
	
	Calculator(){
		 jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(500,600 );
		jf.setVisible(true);
		jf.setLocation(150, 120);
		
		displaylabel=new JLabel();
		displaylabel.setBounds(30, 50, 450, 40);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		
		jf.add(displaylabel);
		
		 seven=new JButton("7");
		seven.setBounds(30,100, 60,80);
		seven.addActionListener(this);
		jf.add(seven);
		
		 eight=new JButton("8");
		eight.setBounds(100,100, 60,80);
		eight.addActionListener(this);
		jf.add(eight);
		
		 nine=new JButton("9");
		nine.setBounds(170,100, 60,80);
		nine.addActionListener(this);
		jf.add(nine);
		
		 four=new JButton("4");
		four.setBounds(30,200, 60,80);
		four.addActionListener(this);
		jf.add(four);
		
	     five=new JButton("5");
		 five.setBounds(100,200, 60,80);
		 five.addActionListener(this);
		jf.add( five);
		
		 six=new JButton("6");
		 six.setBounds(170,200, 60,80);
		 six.addActionListener(this);
		jf.add( six);
		
		 one=new JButton("1");
		one.setBounds(30,300, 60,80);
		one.addActionListener(this);
		jf.add(one);
		
		two=new JButton("2");
		two.setBounds(100,300, 60,80);
		two.addActionListener(this);
		jf.add( two);
		
		 three=new JButton("3");
		 three.setBounds(170,300, 60,80);
		 three.addActionListener(this);
		jf.add( three);
		

		dot=new JButton(".");
		dot.setBounds(30,400, 60,80);
		dot.addActionListener(this);
		jf.add(dot);
		
		 zero=new JButton("0");
		zero.setBounds(100,400, 60,80);
		zero.addActionListener(this);
		jf.add( zero);
		
		 equal=new JButton("=");
		 equal.setBounds(170,400, 60,80);
		 equal.addActionListener(this);
		jf.add(  equal);
		

		div=new JButton("/");
		div.setBounds(240,100, 60,80);
		div.addActionListener(this);
		jf.add(div);
		
		multy=new JButton("*");
		multy.setBounds(240,200, 60,80);
		multy.addActionListener(this);
		jf.add( multy);
		
		add=new JButton("+");
		 add.setBounds(240,300, 60,80);
		 add.addActionListener(this);
		jf.add( add);
		

		sub=new JButton("-");
		 sub.setBounds(240,400, 60,80);
		 sub.addActionListener(this);
		jf.add( sub);
		
		clear=new JButton(" clear");
		 clear.setBounds(310,400, 60,80);
		 clear.addActionListener(this);
		jf.add( clear);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==seven) { 
			
			displaylabel.setText(displaylabel.getText()+"7");
			
		}
		else if (e.getSource()==eight){
			
			displaylabel.setText(displaylabel.getText()+"8");
		}
		
		
		else if(e.getSource()==nine) {
			
			displaylabel.setText(displaylabel.getText()+"9");
		}
		
		else if(e.getSource()==four) {
			
			displaylabel.setText(displaylabel.getText()+"4");
		}
		
		else if(e.getSource()==five) {
			
			displaylabel.setText(displaylabel.getText()+"5");
			
		}
		
		else if (e.getSource()==six) {
			
			displaylabel.setText(displaylabel.getText()+"6");
		}
		
		else if (e.getSource()==one) {
			
			displaylabel.setText(displaylabel.getText()+"1");
		}
		
		else if (e.getSource()==two) {
			
				
			
			displaylabel.setText(displaylabel.getText()+"2");
		}
		
		else if (e.getSource()==three) {
			
			displaylabel.setText(displaylabel.getText()+"3");
		}
		
		else if(e.getSource()==dot) { 
			displaylabel.setText(displaylabel.getText()+".");
			
		}		else if(e.getSource()==zero) {
			
			displaylabel.setText(displaylabel.getText()+"0");
		}
		else if(e.getSource()==equal) {
			b=Double.parseDouble(displaylabel.getText());
			switch(operator) {
			case 1:
				result=a/b;
				break;
			case 2:
				result=a*b;
				break;
			case 3:
				result=a+b;
				break;
			case 4:
				result=a-b;
				break;
			}
			displaylabel.setText(result+"");
			
		}
		else if(e.getSource()==div) {
			a=Double.parseDouble(displaylabel.getText());
			operator=1;
			displaylabel.setText("");
			
		}else if(e.getSource()==multy) {
			a=Double.parseDouble(displaylabel.getText());
			operator=2;
			displaylabel.setText("");
			
		}else if(e.getSource()==add) {
			a=Double.parseDouble(displaylabel.getText());
			operator=3;
			displaylabel.setText("");
			
			
		}else if(e.getSource()==sub) {
			a=Double.parseDouble(displaylabel.getText());
			operator=4;
			displaylabel.setText("");
			
			
		}else if(e.getSource()==clear) {
			displaylabel.setText("");
		}
	}

}
