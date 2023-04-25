import java.util.Scanner;
public class addmatrix {
    public static void main(String[] args){
    	
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("number of rows: ");
        int row=scanner.nextInt();
        
        System.out.println("number of columns:");
        int column=scanner.nextInt();
        
        // matrix1
        System.out.println("Enter matrix1: ");
        
        double[][] Matrix1=new double[row][column];
        
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                Matrix1[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Enter matrix 2: ");
        double[][] Matrix2 = new double[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                Matrix2[i][j]= scanner.nextInt();
            }
        }
        double [][] SumMatrix=new double[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                SumMatrix[i][j]=Matrix1[i][j]+Matrix2[i][j];
            }
        }
        System.out.println("Sum of two matrices:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(SumMatrix[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
}}