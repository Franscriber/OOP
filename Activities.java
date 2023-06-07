package francis;
import java.util.Scanner;

public class Activities {
		  public static void main(String[] args) {
		    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Number 0 - 3: ");
		    int num = sc.nextInt();
		    
		    System.out.println(cars[num]);
		  }

}