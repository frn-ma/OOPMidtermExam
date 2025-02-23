import java.util.Scanner;
public class Rectangle {
	
	public static void area(String[] args) {
		Scanner Rectangle = new Scanner(System.in);
	    int width;
	    int length;
	    
	    System.out.println("Enter width: "); 
	    width = Rectangle.nextInt();   
	       
	    System.out.println("Enter height: "); 
	    length = Rectangle.nextInt();   
	    
	    System.out.println("Area of the rectangle is: " + (width * length));   
	}

}
