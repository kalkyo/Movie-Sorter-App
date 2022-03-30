package comparator;

import movies.DataLayer;

import java.util.List;

/**
 * Max Heap to replace sorting algorithm
 * @author Peter Eang
 * @version 1.0
 */
public class HeapSortMovies
{
    /**
     * Takes a movie array and sorts
     * @param movie array taken in
     */
    public HeapSortMovies(List<DataLayer> movie)
    {
        /*Queue<MovieComparators> heap = new PriorityQueue<>();
        for (int i = 0; i < movie.size(); i++)
        {
            heap.add(object);
        }*/
        sort(movie);
    }

    /**
     * Uses sorting comparator to signify how to sort the movie array given.
     * @param movie to be placed in comparator sorting object
     */
    public static void sort(List<DataLayer> movie)
    {

    }

}
