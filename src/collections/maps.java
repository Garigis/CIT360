package collections;

import java.util.*;

/**
 * Created by colbycooley on 9/26/16.
 */
public class maps {

    public static void main(String[] Args) {
        HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
        HashMap<String, String> hmap2 = new HashMap<String, String>();
        HashMap<Double, String> hmap3 = new HashMap<Double, String>();


        // hmap1 and hmap2 illustrate one nasty path, and a happy path is showed with hmap3.
        hmap1.put(1, "Sorcerer's Stone");
        hmap1.put(2, "Chamber of Secrets");
        hmap1.put(3, "Prisoner of Azkaban");
        hmap1.put(4, "Goblet of Fire");
        hmap1.put(5, "Order of the Phoenix");
        hmap1.put(6, "Half Blood Prince");
        // Note below with the print that Part 1 is overwritten. The hashmap will overwrite entries that have the same key.
        hmap1.put(7, "Deathly Hallows Part 1");
        hmap1.put(7, "Deathly Hallows Part 2");

        // Use a set to print HashMap1 using an interator
        Set set1 = hmap1.entrySet();
        Iterator set1Iterator = set1.iterator();
        while (set1Iterator.hasNext()) {
            Map.Entry entries1 = (Map.Entry) set1Iterator.next();
            System.out.print("key is: " + entries1.getKey() + " & Value is: ");
            System.out.println(entries1.getValue());
        }

        System.out.println("This is what is in hmap1:" + hmap1);

        // hmap2 is just to reiterate the point that you have to have a unique key or it will be overwritten.
        hmap2.put("Harry Potter", "Sorcerer's Stone");
        hmap2.put("Harry Potter", "Chamber of Secrets");
        hmap2.put("Harry Potter", "Prisoner of Azkaban");
        hmap2.put("Harry Potter", "Goblet of Fire");
        hmap2.put("Harry Potter", "Order of the Phoenix");
        hmap2.put("Harry Potter", "Half Blood Prince");
        hmap2.put("Harry Potter", "Deathly Hallows Part 1");
        hmap2.put("Harry Potter", "Deathly Hallows Part 2");

        // Just adding a spacing line.
        System.out.println("\n");

        // Use a set to print HashMap2
        Set set2 = hmap2.entrySet();
        Iterator set2Iterator = set2.iterator();
        while (set2Iterator.hasNext()) {
            Map.Entry entries2 = (Map.Entry) set2Iterator.next();
            System.out.print("key is: " + entries2.getKey() + " & Value is: ");
            System.out.println(entries2.getValue());
        }

        System.out.println("This is what is in hmap2:" + hmap2);

        // Adding to hmap 3. Note that all entries will show up in this hashmap, but they aren't in order.
        hmap3.put(1.0, "Sorcerer's Stone");
        hmap3.put(2.0, "Chamber of Secrets");
        hmap3.put(3.0, "Prisoner of Azkaban");
        hmap3.put(4.0, "Goblet of Fire");
        hmap3.put(5.0, "Order of the Phoenix");
        hmap3.put(6.0, "Half Blood Prince");
        hmap3.put(7.1, "Deathly Hallows Part 1");
        hmap3.put(7.2, "Deathly Hallows Part 2");

        // Just adding a spacing line.
        System.out.println("\n");

        // Use a set to print HashMap3
        Set set3 = hmap3.entrySet();
        Iterator set3Iterator = set3.iterator();
        while (set3Iterator.hasNext()) {
            Map.Entry entries3 = (Map.Entry) set3Iterator.next();
            System.out.print("key is: " + entries3.getKey() + " & Value is: ");
            System.out.println(entries3.getValue());
        }
        System.out.println("This is what is in hmap3:" + hmap3);

        // add nasty paths for put, get, remove
        try {
            hmap1.put(null, null);
            System.out.println("hmap1" + hmap1);

            hmap3.put(7., "String");
            hmap3.put(7.0, "Test");
            System.out.println("hmap3" + hmap3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("hmap1" + hmap1.get(3));
            // Gets null because the key "3" doesn't exists
            System.out.println("hmap2" + hmap2.get(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Remove with key and value flipped, and with them not matching.
        try {
            hmap1.remove("Prisoner of Azkaban", 3);
            System.out.println("hmap1" + hmap1);
            // The result is that nothing is removed.
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // Remove with key
            hmap1.remove(1);
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            // Remove with key
            hmap1.remove(-1);
        } catch(Exception e) {
            e.printStackTrace();
        }
        try {
            // Remove with key
            hmap1.remove(100);
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            hmap1.remove(null, 1);
            System.out.println("hmap1" + hmap1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}