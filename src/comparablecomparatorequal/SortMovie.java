package comparablecomparatorequal;

import java.util.Arrays;
import java.util.Comparator;

public class SortMovie {

        private int yearReleased;
        private double rating;
        private double budget;
        private double collectionAmount;

        public SortMovie(int yearReleased, double rating, double budget, double collectionAmount) {
            this.yearReleased = yearReleased;
            this.rating = rating;
            this.budget = budget;
            this.collectionAmount = collectionAmount;
        }

        // Getter methods for the attributes (yearReleased, rating, budget, collectionAmount) go here

        // Comparator implementation to sort Movie by rating and profit
        public static class RatingProfitComparator implements Comparator<comparablecomparatorequal.SortMovie> {
            @Override
            public int compare(comparablecomparatorequal.SortMovie movie1, comparablecomparatorequal.SortMovie movie2) {
                if (movie1.rating != movie2.rating) {
                    // Sort by rating in descending order
                    return Double.compare(movie2.rating, movie1.rating);
                } else {
                    // Sort by profit (collectionAmount - budget) in descending order
                    return Double.compare(movie2.collectionAmount - movie2.budget, movie1.collectionAmount - movie1.budget);
                }
            }
        }

        // Comparator implementation to sort Movie by year released and rating
        public static class YearRatingComparator implements Comparator<comparablecomparatorequal.SortMovie> {
            @Override
            public int compare(comparablecomparatorequal.SortMovie movie1, comparablecomparatorequal.SortMovie movie2) {
                if (movie1.yearReleased != movie2.yearReleased) {
                    // Sort by year released in ascending order
                    return Integer.compare(movie1.yearReleased, movie2.yearReleased);
                } else {
                    // If years are equal, sort by rating in descending order
                    return Double.compare(movie2.rating, movie1.rating);
                }
            }
        }
        public static void main(String[] args) {
            // Create an array of movies
            comparablecomparatorequal.SortMovie[] movies = {
                    new comparablecomparatorequal.SortMovie(2020, 8.5, 100000000, 200000000),
                    new comparablecomparatorequal.SortMovie(2022, 7.8, 80000000, 150000000),
                    // Add more movies as needed
            };

            // Sort by rating and profit
            Arrays.sort(movies, new RatingProfitComparator());

            // Print sorted movies
            System.out.println("Sorted by rating and profit:");
            for (comparablecomparatorequal.SortMovie movie : movies) {
                System.out.println(movie.yearReleased + " - Rating: " + movie.rating + " - Profit: " +
                        (movie.collectionAmount - movie.budget));
            }

            // Sort by year released and rating
            Arrays.sort(movies, new YearRatingComparator());

            // Print sorted movies
            System.out.println("\nSorted by year released and rating:");
            for (comparablecomparatorequal.SortMovie movie : movies) {
                System.out.println(movie.yearReleased + " - Rating: " + movie.rating);
            }
        }

    }


