package movies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Class that reads CSV file and separates data by the given commas into an array
 *
 * @author Peter Eang
 * @version 1.0
 */
public class Movie
{
    private static int countLines; // used to count the total amount of lines for randomized use
    private static List<DataLayer> movies = new ArrayList<>(); // New movies list using the DataLayer class
    private static File movieFile = new File(getFileName());// create new File given the path

    /**
     * Reads the data in the given CSV File separating each column
     *
     * @return getMovies() which gets the array of the movies
     */
    public static List<DataLayer> readFile()
    {
        try
        {
            Scanner inputStream = new Scanner(getMovieFile());
            inputStream.nextLine();
            while (inputStream.hasNextLine()) // Stops once there are no lines
            {
                String[] parts = inputStream.nextLine().split(",");
                getMovies().add(new DataLayer(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]),
                        Double.parseDouble(parts[4]), Integer.parseInt(parts[5]), Double.parseDouble(parts[6]),
                        Integer.parseInt(parts[7]))); // each part is added as individual objects
                countLines++;
            }
            inputStream.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return getMovies();
    }

    /**
     * Prints out all the movies in the array
     *
     * @param movies the given movie array
     */
    public void showAll(List<DataLayer> movies)
    {
        System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s", "FILM", "GENRE", "STUDIO", "AUDIENCE"
                , "PROFIT", "RT SCORE", "WORLD GROSS", "YEAR");
        System.out.println();
        for (DataLayer list : movies) // each row
        {
            System.out.printf("%-30s ", list); // formatting
            System.out.println();
        }
    }

    /**
     * Prints out one random movie using random based on the countLines element
     *
     * @param movies the given movie array
     */
    public void showRandomMovie(List<DataLayer> movies)
    {
        Random random = new Random();
        int randomLine = random.nextInt(countLines);
        DataLayer movie = movies.get(randomLine); //random line within the movie array
        System.out.println(movie);// prints out that random line
    }

    /**
     * @return the fileName
     */
    public static String getFileName()
    {
        return "movies.csv";
    }

    /**
     * @return the moviefile file
     */
    public static File getMovieFile()
    {
        return movieFile;
    }

    /**
     * @return movies in the array with information
     */
    public static List<DataLayer> getMovies()
    {
        return movies;
    }
}
