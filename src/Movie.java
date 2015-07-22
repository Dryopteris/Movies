
public class Movie {
	public static String title;
	public static String category;
	
	public Movie (String title, String category) {
			Movie.title = title;
			Movie.category = category;
		}

	public static String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		Movie.title = title;
	}

	public static String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		Movie.category = category;
	}

	

	
}
