package calculate;


import javax.swing.JOptionPane;

public class calculate {
	public static void main(String[] args) {
		String strNum1,strNum2;
		String strNotification = "You've just entered: ";
		double sum,difference,product,quotient;
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ",
				"Input the first number",JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ",
				"Input the second number",JOptionPane.INFORMATION_MESSAGE);
		
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2); 
		
		sum = num1 + num2;
		difference =  num1 - num2;
		product = num1 * num2;
		quotient = num1 / num2;

		String strsum = Double.toString(sum);
		String strdifference = Double.toString(difference);
		String strproduct = Double.toString(product);
		String strquotient = Double.toString(quotient);
		
		System.out.println("the sum of two number is :" + strsum);
		System.out.println("the difference of two number is :" + strdifference);
		System.out.println("the product of two number is :" + strproduct);
		System.out.println("the quotient of two number is :" + strquotient);
		System.exit(0);
	}
}