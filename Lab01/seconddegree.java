package seconddegree;

import javax.swing.JOptionPane;
import java.lang.Math;

public class seconddegree {
	public static void main(String[] args) {
		String stra,strb,strc;
		// String strNotification = "You've just entered: ";
		double delta,x0,x1,x2;
		
		stra = JOptionPane.showInputDialog(null,
				"Please input the firts weight: ",
				"Input the first weight",JOptionPane.INFORMATION_MESSAGE);
		strb = JOptionPane.showInputDialog(null,
				"Please input the second weight: ",
				"Input the second weight",JOptionPane.INFORMATION_MESSAGE);
		
		strc = JOptionPane.showInputDialog(null,
				"Please input the third weight: ",
				"Input the third weight",JOptionPane.INFORMATION_MESSAGE);

		double a = Double.parseDouble(stra);
		double b = Double.parseDouble(strb);
		double c = Double.parseDouble(strc);
		
		delta = b*b- 4*a*c;
		
		x0 = -b/(2*a);
		String strx0 = Double.toString(x0);
		if (delta < 0) {
			System.out.println("no solution");
		}
		if (delta == 0) {
			System.out.println("The root of this equation is: " + strx0);	
		}
		if (delta >0) {
			x1 = (-b-Math.sqrt(delta))/(2*a);
			x2 = (-b+Math.sqrt(delta))/(2*a);
			String strx1 = Double.toString(x1);
			String strx2 = Double.toString(x2);
			System.out.println("The root of this equation is: " +strx1 +" and"+strx2  );
		}
		
		System.exit(0);
	}
}