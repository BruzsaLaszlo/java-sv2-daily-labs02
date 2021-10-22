package day05;

public class Movie {

    private final String title;
    private final int year;
    private int ratingsCount;
    private int sumOfRatings;

    private double averageRatings;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
        ratingsCount = 0;
        sumOfRatings = 0;
    }

    public double addRating(int rating) {

        if (rating <= 5 && rating >= 1) {
            ratingsCount++;
            sumOfRatings += rating;
            averageRatings = (double) sumOfRatings / ratingsCount;
        }

        return averageRatings;

    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getRatingsCount() {
        return ratingsCount;
    }

    public double getAverageRatings() {
        return averageRatings;
    }
}
