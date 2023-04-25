package linearequationtwovar;

import javax.swing.JOptionPane;

public class linearequationtwovar {
	public static void main(String[] args) {
		String stra11,stra12,stra21,stra22,strb1,strb2;
		// String strNotification = "You've just entered: ";
		double x1,x2;
		
		stra11 = JOptionPane.showInputDialog(null,
				"Please input the firts weight: ",
				"Input the first weight",JOptionPane.INFORMATION_MESSAGE);
		stra12 = JOptionPane.showInputDialog(null,
				"Please input the second weight: ",
				"Input the second weight",JOptionPane.INFORMATION_MESSAGE);
		
		strb1 = JOptionPane.showInputDialog(null,
				"Please input the third weight: ",
				"Input the third weight",JOptionPane.INFORMATION_MESSAGE);
		stra21 = JOptionPane.showInputDialog(null,
				"Please input the fourth weight: ",
				"Input the fourth weight",JOptionPane.INFORMATION_MESSAGE);
		stra22 = JOptionPane.showInputDialog(null,
				"Please input the fifth weight: ",
				"Input the fifth weight",JOptionPane.INFORMATION_MESSAGE);
		strb2 = JOptionPane.showInputDialog(null,
				"Please input the sixth weight: ",
				"Input the sixth weight",JOptionPane.INFORMATION_MESSAGE);
		double a11 = Double.parseDouble(stra11);
		double a12 = Double.parseDouble(stra12);
		double a21 = Double.parseDouble(stra21);	
		double a22 = Double.parseDouble(stra22);
		double b1 = Double.parseDouble(strb1);
		double b2 = Double.parseDouble(strb2);
		x2 = (a21*b1-a11*b2)/(a21*a12-a11*a22);
		x1 = (b1-a12*x2)/a11;
		String strx1 = Double.toString(x1);
		String strx2 = Double.toString(x2);
		System.out.println("The root of this equation is: " + "( "+strx1 +","+strx2 + ")" );

		System.exit(0);
	}
}