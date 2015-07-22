import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieListApp {

	static List<Movie> movies = new ArrayList<Movie>();

	public static void main(String[] args) {

		buildMovieList();

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Movie List Application!\n");
		System.out.println("There are 100 movies in this list.");
		System.out.print("What kind of movie would you like to watch? ");
		String input = sc.next();

		displaySelectedMovieTitle(input);

		sc.close();
	}

	private static void displaySelectedMovieTitle(String input) {
		for (Movie movie : movies) {
			if (input.equalsIgnoreCase(Movie.category)) {
				System.out.printf("%s\n", Movie.title);
			}
		}
		
		
/*		for (int i = 0; i < 100; i++) {
			
			if (input.equalsIgnoreCase(Movie.getCategory())) {
				System.out.println(Movie.getTitle());
			}
		}
*/
	}

	private static void buildMovieList() {
		for (int i = 1; i < 101; i++) {
			Movie movie = MovieIO.getMovie(i);
			movies.add(movie);
		}
	}

}
