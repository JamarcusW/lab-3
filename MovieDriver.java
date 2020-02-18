import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String title,ans, rating;
		
		int ticketSold;
		
		Movie p;
		Scanner input = new Scanner(System.in);
		do {

			System.out.println("Enter name of the movie: ");
			title = input.nextLine();
			
			
			System.out.println("Enter the rating of the movie: ");
			rating = input.nextLine();
			
			System.out.println("Enter the amount of tickets sold : ");
			ticketSold = input.nextInt();
			
			p = new Movie(title,rating, ticketSold);
		
			
			System.out.println(p);

			input.nextLine();
			
			System.out.println("Do you want to continue?(y or n)");
			
			
			ans = input.nextLine();
		}while (ans.equals("y") );
		
	}

}
