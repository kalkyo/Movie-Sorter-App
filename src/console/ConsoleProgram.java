package console;

import comparator.MovieComparators;
import movies.DataLayer;
import movies.Movie;

import java.util.List;

/**
 * Driver class for the movie night application
 *
 * @author Peter Eang
 * @version 1.0
 */
public class ConsoleProgram
{
    /**
     * @param args not valid
     */
    public static void main(String[] args)
    {
        Console.println("*******************************************" + "\n" +
                "Welcome to the Movie Night Application" + "\n" +
                " " + "\n" + "This program will display movie suggestions " + "\n"
                + "and allow you to sort movies in different " + "\n" + "ways" +
                "\n" + "********************************************");
        System.out.println();
        showMenu();
    }

    /**
     * Create a new movie object and present the menu for the user
     */
    public static void showMenu()
    {
        List<DataLayer> movies = Movie.readFile();
        Movie test = new Movie();
        int choice;
        Console.println("Pick from the following:" + "\n" +
                "1. Show all movies" + "\n" +
                "2. Show a random movie" + "\n" +
                "3. Sort movies" + "\n" +
                "4. Exit");
        choice = Console.getInt();

        switch (choice)
        {
            case 1:
                test.showAll(movies);
                System.out.println();
                showMenu();
            case 2:
                System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s", "FILM", "GENRE", "STUDIO", "AUDIENCE"
                        , "PROFIT", "RT SCORE", "WORLD GROSS", "YEAR");
                System.out.println();
                test.showRandomMovie(movies);
                System.out.println();
                showMenu();
            case 3:
                sortMenu(movies);
                System.out.println();
                showMenu();
            case 4:
                System.out.println("Exiting Application");
                break;
        }
    }

    private static void sortMenu(List<DataLayer> movies)
    {
        Movie test = new Movie();
        int choice;
        Console.println("Enter a comparator:" + "\n" + "1. By film" + "\n" + "2. By genre" + "\n" +
                "3. By studio" + "\n" + "4. By audience" + "\n" + "5. By profit" + "\n" + "6. By RT score" + "\n" +
                "7. By world gross" + "\n" + "8. By year" + "\n");
        choice = Console.getInt();

        switch (choice)
        {
            case 1:
                movies.sort(new MovieComparators.FilmComparator());
                test.showAll(movies);
                break;
            case 2:
                movies.sort(new MovieComparators.GenreComparator());
                test.showAll(movies);
                break;

            case 3:
                movies.sort(new MovieComparators.StudioComparator());
                test.showAll(movies);
                break;
            case 4:
                movies.sort(new MovieComparators.AudienceComparator());
                test.showAll(movies);
                break;
            case 5:
                movies.sort(new MovieComparators.ProfitComparator());
                test.showAll(movies);
                break;
            case 6:
                movies.sort(new MovieComparators.RTComparator());
                test.showAll(movies);
                break;
            case 7:
                movies.sort(new MovieComparators.WorldGrossComparator());
                test.showAll(movies);
                break;
            case 8:
                movies.sort(new MovieComparators.YearComparator());
                test.showAll(movies);
                break;
        }
    }
}
