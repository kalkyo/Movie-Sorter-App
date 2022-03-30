package comparator;

import movies.DataLayer;
import java.util.Comparator;

/**
 * Comparator class for movies based on the given input
 * @author Peter Eang
 * @version 1.0
 */
public class MovieComparators
{
    public static class FilmComparator extends MovieComparators implements Comparator<DataLayer>
    {
        @Override
        public int compare(DataLayer first, DataLayer second)
        {
            return first.getFilm().compareTo(second.getFilm());
        }

        @Override
        public Comparator<DataLayer> reversed()
        {
            return Comparator.super.reversed();
        }
    }

    public static class GenreComparator implements Comparator<DataLayer>
    {
        @Override
        public int compare(DataLayer first, DataLayer second)
        {
            return first.getGenre().compareTo(second.getGenre());
        }
    }

    public static class StudioComparator implements Comparator<DataLayer>
    {
        @Override
        public int compare(DataLayer first, DataLayer second)
        {
            return first.getStudio().compareTo(second.getStudio());
        }
    }

    public static class AudienceComparator implements Comparator<DataLayer>
    {
        @Override
        public int compare(DataLayer first, DataLayer second)
        {
            Integer test1 = first.getAudience();
            Integer test2 = second.getAudience();
            return test1.compareTo(test2);
        }
    }

    public static class ProfitComparator implements Comparator<DataLayer>
    {
        @Override
        public int compare(DataLayer first, DataLayer second)
        {
            Double firstDouble = first.getProfit();
            Double secondDouble = second.getProfit();
            return firstDouble.compareTo(secondDouble);
        }
    }

    public static class RTComparator implements Comparator<DataLayer>
    {
        @Override
        public int compare(DataLayer first, DataLayer second)
        {
            Integer movie1 = first.getRotten();
            Integer movie2 = second.getRotten();
            return movie1.compareTo(movie2);
        }
    }

    public static class WorldGrossComparator implements Comparator<DataLayer>
    {
        @Override
        public int compare(DataLayer first, DataLayer second)
        {
            Double firstDouble = first.getGross();
            Double secondDouble = second.getGross();
            return firstDouble.compareTo(secondDouble);
        }
    }

    public static class YearComparator implements Comparator<DataLayer>
    {
        @Override
        public int compare(DataLayer first, DataLayer second)
        {
            Integer movie1 = first.getYear();
            Integer movie2 = second.getYear();
            return movie1.compareTo(movie2);
        }
    }
}
