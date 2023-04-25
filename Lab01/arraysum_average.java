import java.util.Arrays;
import java.util.Scanner;
public class arraysum_average {
	
    public static void main(String[] args){
    	
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size=scanner.nextInt();

        int[] array= new int[size]; // size of array
        for (int i=0;i<size;i++){
            array[i]=scanner.nextInt(); // enter each element of array
        }
        
        Arrays.sort(array); // sort
        
        int sum=0;
        
        for (int i=0;i<size;i++){
            sum+=array[i];
        
        }
        double average=(double) sum/size;
        
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+average);
        scanner.close();

    }
}