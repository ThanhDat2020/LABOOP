package linearequationonevar;

import javax.swing.JOptionPane;

public class linearequationonevar {
	public static void main(String[] args) {
		String strweight1,strweight2;
		// String strNotification = "You've just entered: ";
		double root;
		
		strweight1 = JOptionPane.showInputDialog(null,
				"Please input the firts weight: ",
				"Input the first weight",JOptionPane.INFORMATION_MESSAGE);
		strweight2 = JOptionPane.showInputDialog(null,
				"Please input the second weight: ",
				"Input the second weight",JOptionPane.INFORMATION_MESSAGE);
		
		double weight1 = Double.parseDouble(strweight1);
		double weight2 = Double.parseDouble(strweight2); 
		
		
		root = -weight2/weight1;
		String strroot = Double.toString(root);
		System.out.println("The root of this equation is: "+strroot);

		System.exit(0);
	}
}