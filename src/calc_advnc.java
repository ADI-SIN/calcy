
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import java.util.*;

public class calc_advnc extends JFrame {
	private static double numa;
	private static double numb;
	private static double numc;
	private static double numd;
	
	
	
	
	
	
	public calc_advnc(){
		 super("!! SCIENTIFIC CALCULATOR !!");
		 setLayout(new FlowLayout());
		 
		 JTextField newmsg= new JTextField("               Now you can use more than two operands and perform advanced mathematical operations                      ");
		 newmsg.setEditable(false);
		 newmsg.setFont(new Font(("Serif"),Font.BOLD,15));
		 newmsg.setBackground(Color.GREEN);
		 add(newmsg);
		 
		
		 JButton op1= new JButton(new AbstractAction("  MORE OPERANDS  "){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(getParent(), "Due to some to errors, it is adviced that you have to resize the window to proceed");
					JButton operanda=new JButton( new AbstractAction("1st operand"){

						@Override
						public void actionPerformed(ActionEvent arg0) {
						String x =JOptionPane.showInputDialog("enter the first operand ");
						numa= Double.parseDouble(x);
						}
						 
					 }
							 
							 );
					 add(operanda);
					
					
					 
					JButton operandb=new JButton( new AbstractAction("2nd operand"){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							String y = JOptionPane.showInputDialog("enter the second operand ");
							numb= Double.parseDouble(y);
							
						}
						 
					 }
							 
							 );
					 add(operandb);
					 
					 
					 JButton operandc=new JButton( new AbstractAction("3rd operand"){

							@Override
							public void actionPerformed(ActionEvent arg0) {
								
								String y1 = JOptionPane.showInputDialog("enter the third operand ");
								numc=Double.parseDouble(y1);
								
							}
							 
						 }
								 
								 );
						 add(operandc);
						 
						 JButton operandd=new JButton( new AbstractAction("4th operand"){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									String x1 = JOptionPane.showInputDialog("enter the fourth operand ");
									numd= Double.parseDouble(x1);
									
								}
								 
							 }
									 
									 );
							 add(operandd);
					 
					 
				}
				 
			 }
			 );
			 JButton op2= new JButton(new AbstractAction("  MORE OPERATIONS  "){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(getParent(), "Due to some to errors, it is adviced that you have to resize the window to proceed");
					 
					JButton add= new JButton(new AbstractAction("+"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= numa+numb+numc+numd;
							JOptionPane.showMessageDialog(getParent(), " the sum of numbers is "+sum);
						}
						 
					 }
					 );
					 
					JButton sub= new JButton(new AbstractAction("-"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= numa-numb;
							JOptionPane.showMessageDialog(getParent(), " the difference of two numbers is "+sum);
						}
						 
					 }
					 );
					 
					JButton mul= new JButton(new AbstractAction("*"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= numa*numb;
							JOptionPane.showMessageDialog(getParent(), " the product of two numbers is "+sum);
						}
						 
					 }
					 );
					 
					JButton div= new JButton(new AbstractAction("/"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= numa/numb;
							JOptionPane.showMessageDialog(getParent(), " the quotient of two numbers is "+sum);
						}
						 
					 }
					 );
					
					JButton sqr= new JButton(new AbstractAction("sqr"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= numa*numa;
							JOptionPane.showMessageDialog(getParent(), " the square of"+numa+" is "+sum);
						}
						 
					 }
					 );
					
					JButton sqrt= new JButton(new AbstractAction("sqrt"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.sqrt(numa);
							JOptionPane.showMessageDialog(getParent(), " the square root of"+numa+"  is "+sum);
						}
						 
					 }
					 );
					JButton power= new JButton(new AbstractAction("pow"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.pow(numa,numb);
							JOptionPane.showMessageDialog(getParent(), " the value of "+numa+" raised to the power"+numb+" is "+sum);
						}
						 
					 }
					 );
					JButton log= new JButton(new AbstractAction("log"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.log(numa);
							JOptionPane.showMessageDialog(getParent(), " the logarithm (base e) of the number "+numa+" is "+sum);
						}
						 
					 }
					 );
					JButton log10= new JButton(new AbstractAction("log10"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.log10(numa);
							JOptionPane.showMessageDialog(getParent(), " the natural logarithm (base 10) of the number "+numa+" is "+sum);
						}
						 
					 }
					 );
					JButton sin= new JButton(new AbstractAction("sin"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.sin(numa);
							JOptionPane.showMessageDialog(getParent(), " the sine of the number "+numa+" is "+sum);
						}
						 
					 }
					 );
					JButton cos= new JButton(new AbstractAction("cos"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.cos(numa);
							JOptionPane.showMessageDialog(getParent(), " the cosine of the number "+numa+" is "+sum);
						}
						 
					 }
					 );
					JButton tan= new JButton(new AbstractAction("tan"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.tan(numa);
							JOptionPane.showMessageDialog(getParent(), " the tangent of the number "+numa+" is "+sum);
						}
						 
					 }
					 );
					JButton asin= new JButton(new AbstractAction("sin-1"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.asin(numa);
							JOptionPane.showMessageDialog(getParent(), " the sine inverse of the number "+numa+" is "+sum);
						}
						 
					 }
					 );
					
					JButton sinh= new JButton(new AbstractAction("sinh"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.sinh(numa);
							JOptionPane.showMessageDialog(getParent(), " the hyperbolic sine of the number "+numa+" is "+sum);
						}
						 
					 }
					 );
					JButton acos= new JButton(new AbstractAction("cos-1"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.acos(numa);
							JOptionPane.showMessageDialog(getParent(), " the cosine inverse of the number "+numa+" is "+sum);
						}
						 
					 }
					 );
					JButton cosh= new JButton(new AbstractAction("cosh"){
						 
						@Override
						public void actionPerformed(ActionEvent arg0) {
							double sum= Math.cosh(numa);
							JOptionPane.showMessageDialog(getParent(), " the hyperbolic cosine of the number "+numa+" is "+sum);
						}
						 
					 }
					 );
					
					 
					 
					
					 
					 add(add);
					 add(sub);
					 add(mul);
					 add(div);
					 add(sqr);
					 add(sqrt);
					 add(power);
					 add(log);
					 add(log10);
					 add(sin);
					 add(cos);
					 add(tan);
					 add(asin);
					 add(acos);
					 add(sinh);
					 add(cosh);
					 
					 
					
					
				}
				 
			 }
			 );
			 
			 
			 
			 
			 add(op1);
			 add(op2);
			 
			 op1.setBackground(Color.cyan);
			 op2.setBackground(Color.cyan);
			
		}
		 
	 
	 
	 


}
