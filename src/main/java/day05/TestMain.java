package day05;

import java.util.Random;

public class TestMain {

    public static void main(String[] args) {

        Movie m1 = new Movie("A keresztapa", 1972);
        Movie m2 = new Movie("A keresztapa II", 1974);
        Movie m3 = new Movie("A remény rabjai", 1994);

        Viewer viewer = new Viewer();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            viewer.watchMovie(m1, random.nextInt(5) + 1);
            viewer.watchMovie(m2, random.nextInt(5) + 1);
            viewer.watchMovie(m3, random.nextInt(5) + 1);
        }

        System.out.println(m1.getTitle() + ": " + m1.getAverageRatings());
        System.out.println(m2.getTitle() + ": " + m2.getAverageRatings());
        System.out.println(m3.getTitle() + ": " + m3.getAverageRatings());

    }

}
