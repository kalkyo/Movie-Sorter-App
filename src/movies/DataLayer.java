package movies;

/**
 * A datalayer class that loads all movie objects into an array
 *
 * @author Peter Eang
 * @version 1.0
 */
public class DataLayer implements Comparable<DataLayer>
{

    private String film;
    private String genre;
    private String studio;
    private int audience;
    private double profit;
    private int rotten;
    private double gross;
    private int year;

    /**
     * @param film film name
     * @param genre genre type
     * @param studio studio name
     * @param audience audience score
     * @param profit profit numbers
     * @param rotten RT scores
     * @param gross profit gross
     * @param year year of the movie
     */
    public DataLayer(String film, String genre, String studio, int audience, double profit, int rotten,
                     double gross, int year)
    {
        this.film = film;
        this.genre = genre;
        this.studio = studio;
        this.audience = audience;
        this.profit = profit;
        this.rotten = rotten;
        this.gross = gross;
        this.year = year;
    }

    /**
     * @return film name
     */
    public String getFilm()
    {
        return film;
    }

    /**
     * @return genre type
     */
    public String getGenre()
    {
        return genre;
    }

    /**
     * @return studio name
     */
    public String getStudio()
    {
        return studio;
    }


    /**
     * @return audience score
     */
    public int getAudience()
    {
        return audience;
    }


    /**
     * @return profit amount
     */
    public double getProfit()
    {
        return profit;
    }


    /**
     * @return Rotten Tomato score
     */
    public int getRotten()
    {
        return rotten;
    }


    /**
     * @return ProfitGross score
     */
    public double getGross()
    {
        return gross;
    }


    /**
     * @return Year number
     */
    public int getYear()
    {
        return year;
    }


    @Override
    public String toString()
    {
        return String.format("%-30s%-30s%-30s%-30d%-30f%-30d%-30f%-30d", film , genre, studio,
                audience, profit, rotten, gross,
                 year);
    }

    @Override
    public int compareTo(DataLayer other)
    {
        if (film.compareTo(other.film) < 0)
        {
            return -1;
        }
        else if (film.compareTo(other.film) > 0)
        {
            return 1;
        }
        return 0;
    }
}

