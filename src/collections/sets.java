package collections;

import java.util.*;

/**
 * Created by colbycooley on 9/26/16.
 */
public class sets {

    public static void main(String[] args) {
        // Create a hash set
        HashSet<String> movies = new HashSet<String>();

        // Add movies, including duplicates to show something unique about sets.
        movies.add("Harry Potter");
        movies.add("Lord of the Rings");
        movies.add("Ender's Game");
        movies.add("X-Men");
        movies.add("Bourne Identity");
        movies.add("Harry Potter");
        movies.add("Lord of the Rings");
        movies.add(null);

        // Print the HashSet.
        System.out.println("Printing movies in the HashSet:" + movies);

        // Print the HashSet using Iterator.
        Iterator<String> moviesIterator = movies.iterator();
        System.out.println("\nPrinting movies in the HashSet using an Iterator.");
        while (moviesIterator.hasNext()){
            System.out.println(moviesIterator.next());
        }

        HashSet<String> testset1 = new HashSet<String>();

        // Happy Path to cloning a set.
        HashSet<String> cloneset = (HashSet)movies.clone();

        // Happy path to copying a set
        HashSet<String> testset2 = new HashSet<>(movies);

        // Happy Path to see if set contains something.
        System.out.println(movies.contains("Harry Potter"));

        // Works but not nearly as convenient.
        if (movies.contains("Harry Potter")) {
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
        // nasty paths for duplicates, removing, adding

        // Nasty Path: Adding a blank collection to one that already is populated
        try {
            testset2.addAll(testset1);
            System.out.println("\n" + testset2);
        }
        catch (EmptyStackException e){
            e.printStackTrace();
        }

        // Nasty Path: Adding duplicates, empty strings, and null
        try {
            testset2.add("X-Men");
            testset2.add("");
            testset2.add(null);
            System.out.println("\n" + testset2);
        }
        catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        // Nasty Path: Delete item that could be a duplicate and indexes that don't exist
        try {
            testset2.remove("X-Men");
            testset2.remove(9);
            System.out.println("\n" + testset2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        // Nasty Path: adding a set to itself.
        // This is a nasy path, because it is useless.
        try {
            testset1.addAll(testset1);
            System.out.println("This worked");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        // Nasty Path: remove all from a set. You should use remove all
        try {
            testset1.add("Harry Potter");
            testset1.add("X-Men");
            System.out.println("\n" + testset1);
            testset1.remove(testset1);
            System.out.println("This worked 2");
            System.out.println("\n" + testset1);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("This failed");
        }

        // Happy Path: remove all from a set
        try {
            testset1.add("Harry Potter");
            testset1.add("X-Men");
            testset1.removeAll(testset1);
            System.out.println("\n" + testset1);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
