package collections;

import java.util.*;

/**
 * Created by colbycooley on 9/26/16.
 */
public class trees {

    public static void main(String[] args) {
        // Happy Paths to adding elements and sorting them.
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        for (int i = 0; i <5; i++) {
            treeSet1.add(i);
        }

        // Print TreeSet in ascending order.
        System.out.println(treeSet1);

        // Print TreeSet in descending order.
        TreeSet<Integer> treeSet2 = new TreeSet(Collections.reverseOrder());
        for (int j = 0; j <5; j++) {
            treeSet2.add(j);
        }
        System.out.println(treeSet2);

        // Nasty path to sorting set in reverse order
        System.out.println(treeSet1.descendingSet());

        // add dups
        try {
            for (int j = 0; j < 1; j++) {
                treeSet2.add(j);
                System.out.println("\n" + treeSet2);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // add numbers between after created
        TreeSet<Double> treeSet3 = new TreeSet<>();
        for (double i = 0.0; i < 5.0; i++) {
            treeSet3.add(i);
        }

        System.out.println("TreeSet3" + treeSet3);

        try {
            treeSet3.add(2.1);
            treeSet3.add(2.2);
            treeSet3.add(2.15);
            System.out.println("TreeSet3" + treeSet3);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            treeSet1.add(2);
            System.out.println(treeSet1);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // add null
        try {
            // Raises NullPointerException
            treeSet1.add(null);
        }
        catch (NullPointerException ex) {
            System.out.println("Errors Found");
        }
        // happy/nasty for remove
        try {
            // This is happy for remove.
            treeSet2.remove(1);
            System.out.println(treeSet2);

            // This raises a question for me. When I print TreeSet1, why does it show only [1] in TreeSet1 when I removed
            // [1] from TreeSet2, then used this Nasty Path for removeAll from TreeSet2
            treeSet1.removeAll(treeSet2);

            // This is the happy path for removing all from one treeset.
            treeSet2.removeAll(treeSet2);
            System.out.println("TreeSet1" + treeSet1 + "\nTreeSet2" + treeSet2);
        }
        catch (Exception e) {
            System.out.println("Theres a mess here");
        }

        // Nasty Path for removing
        try {
            // Raises NullPointerException error
            treeSet1.remove(null);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            // Does Nothing
            treeSet1.remove(10);
            System.out.println(treeSet1);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
