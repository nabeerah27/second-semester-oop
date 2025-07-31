package Week_01.HomeWork;

public class Movie {

    // Public attributes
    String title;
    String genre;

    // Parameterized constructor to initialize Movie object
    Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    // Prints the attributes of Movie object
    public void getMovieInfo() {
        System.out.println("Movie title: " + title);
        System.out.println("Movie genre: " + genre);
    }

}
