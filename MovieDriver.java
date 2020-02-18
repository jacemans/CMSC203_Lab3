
/**
 * MovieDriver class, drives Movie objects
 * @author Jace
 *
 */

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String answer;

		Movie movie = new Movie();

		do {
			System.out.print("Enter movie title: ");
			movie.setTitle(scan.nextLine());
			System.out.print("Enter movie rating: ");
			movie.setRating(scan.nextLine());
			System.out.print("Enter movie tickets sold: ");
			movie.setSoldTickets(scan.nextInt());

			System.out.println(movie.toString());
			System.out.print("Would you like to continue(y/n): ");
			scan.nextLine();
			answer = scan.nextLine();
		}while(answer.equalsIgnoreCase("y"));

		scan.close();
	}

}