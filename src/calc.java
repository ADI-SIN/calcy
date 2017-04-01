
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import java.util.*;

public class calc extends JFrame {
	
	calc_advnc obj1 = new calc_advnc();
	
	
	private int num1;
	private int num2;
	private int numa;
	private int numb;
	private int numc;
	
	private JTextField msg;
	
	private final JButton operand1;
	private final JButton operand2;
	
	private final JButton add;
	private JButton sub;
	private JButton mul;
	private JButton div;
	private JButton rmndr;
	
	 public calc(){
		 super("!! SIMPLE CALCULATOR !!");
		 
		 setLayout(new FlowLayout());
		
		 msg= new JTextField("        enter the nos. from the keyboard in operands, and then select the operator       ");
		 msg.setEditable(false);
		 msg.setFont(new Font(("Serif"),Font.BOLD,15));
		 msg.setBackground(Color.ORANGE);
		 add(msg);
		 
		 JButton instruct=new JButton( new AbstractAction("HOW IT WORKS"){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(getParent(), "This is a simple calculator that works on core java, you have to enter the operands first and then select the operator (postfix notation)\n\ndeveloper: ADITYA SINGH");
				}
				 
			 }
					 
					 );
			 add(instruct);
		 
		 
		 operand1=new JButton( new AbstractAction("1st operand"){

			@Override
			public void actionPerformed(ActionEvent arg0) {
			String x =JOptionPane.showInputDialog("enter the first operand ");
			num1= Integer.parseInt(x);
			}
			 
		 }
				 
				 );
		 add(operand1);
		
		
		 
		 operand2=new JButton( new AbstractAction("2nd operand"){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String y = JOptionPane.showInputDialog("enter the second operand ");
				num2= Integer.parseInt(y);
				
			}
			 
		 }
				 
				 );
		 add(operand2);
		 ;
		 
		
		 
		add= new JButton(new AbstractAction("+"){
			 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int sum= num1+num2;
				JOptionPane.showMessageDialog(getParent(), " the sum of two numbers is "+sum);
			}
			 
		 }
		 );
		 
		sub= new JButton(new AbstractAction("-"){
			 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int sum= num1-num2;
				JOptionPane.showMessageDialog(getParent(), " the difference of two numbers is "+sum);
			}
			 
		 }
		 );
		 
		mul= new JButton(new AbstractAction("*"){
			 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int sum= num1*num2;
				JOptionPane.showMessageDialog(getParent(), " the product of two numbers is "+sum);
			}
			 
		 }
		 );
		 
		div= new JButton(new AbstractAction("/"){
			 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int sum= num1/num2;
				JOptionPane.showMessageDialog(getParent(), " the quotient of two numbers is "+sum);
			}
			 
		 }
		 );
		 
		rmndr= new JButton(new AbstractAction("%"){
			 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int sum= num1%num2;
				JOptionPane.showMessageDialog(getParent(), " the remainder of two numbers is "+sum);
			}
			 
		 }
		 );
		 
		 add(add);
		 add(sub);
		 add(mul);
		 add(div);
		 add(rmndr);
		 
		 JTextField msg1= new JTextField("                    press ADVANCED OPTIONS for more features                    ");
		 msg1.setEditable(false);
		 msg1.setFont(new Font(("Serif"),Font.BOLD,15));
		
		 msg1.setBackground(Color.ORANGE);
		 add(msg1);
		 
		 JButton more= new JButton(new AbstractAction("ADVANCED OPTIONS"){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				obj1.setSize(900,400);
				obj1.setVisible(true);
				
			}
		 }
		 );
		 add(more);
		 more.setBackground(Color.GRAY);
		 
		 
		
	
	 }
	 
	 
	
	

}
