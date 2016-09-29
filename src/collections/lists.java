package collections;

/**
 * Created by colbycooley on 9/26/16.
 */

import java.util.*;

public class lists {

    public static void main(String[] args) {


    /**
     * Creating ArrayList<String>, adding, removing, and joining two together.
     */
        // Happy Path to create, add, and remove from ArrayLists.
        List<String> fruitList = new ArrayList<String>();
        List<String> vegetableList = new ArrayList<String>();
        List<String> foodList = new ArrayList<String>();

        fruitList.add("Apples");
        fruitList.add("Oranges");
        fruitList.add("Bananas");
        fruitList.add("Pears");
        fruitList.add("Asparagus");

        System.out.println("The fruit list has: " + fruitList);
        System.out.println("Asparagus isn't a fruit. Remove it.");

        fruitList.remove(4);

        System.out.println("Check to see if Asparagus was removed. " + fruitList);

        vegetableList.add("Tomatoes");
        vegetableList.add("Corn");
        vegetableList.add("Carrots");
        vegetableList.add("Potatoes");
        vegetableList.add("Celery");

        System.out.println("Here is the vegetable list: " + vegetableList);
        System.out.println("Tomatoes seem to be in a debate over if they are a fruit or vegetable. Lets remove that.");

        vegetableList.remove("Tomatoes");

        System.out.println("Here is the list once tomatoes are removed. " + vegetableList);

        System.out.println("Here are the array lists." + "The fruit list: " + fruitList + "\nHere is the vegetable list"
        + vegetableList);

        System.out.println("Lets sort them alphabetically");

        Collections.sort(fruitList, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(vegetableList, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Here are the sorted lists. \n The fruit list: " + fruitList + "\n The vegetable list: " +
        vegetableList);

        System.out.println("Lets add these two lists together into a brand new list.");
        foodList.addAll(fruitList);
        foodList.addAll(vegetableList);

        System.out.println("Here is the new list: " + foodList);
        System.out.println("Now lets sort that list.");

        Collections.sort(foodList);

        System.out.println("Here is the sorted food list: " + foodList);

        // Works, but not a recommended way to make an array list
        ArrayList listtest = new ArrayList();
        System.out.println(listtest);

        // Nasty Path for sorting, because you might get hung up trying to figure out what to put in it.
        //listtest.sort();

        // Happy path to remove the last
        fruitList.remove("What the last element is and put the object name or it's index. You can't just pick " +
                "a high number.");

        // Nasty Path for removing
        try {
            fruitList.remove(13);
            System.out.println(fruitList);
        }
        catch (Exception ex) {
            System.out.println("There's a big problem");
        }


        // Happy path for adding.
        fruitList.add(2, "The name of the object you want to add, with where you want to add, so long as it is" +
                "in the range of the current array.");

        // Nasty Path for adding.
        try {
            fruitList.add(12, "Pine Apple");
        } catch (Exception e) {
            e.printStackTrace();
        }
            try {
                fruitList.add(- 2, "Pine Apple");
                System.out.println(fruitList);
            }
            catch (IndexOutOfBoundsException ex) {
                System.out.println("There's a problem");
            }

        // remove negative index
        try {
            fruitList.remove(-12);
            System.out.println(fruitList);
        }
        catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        // nasty path for addAll and any other method used in here.
        try {
            List<String> intList1 = new ArrayList<>();
            // This makes a compilation error
            //fruitList.addAll(intList1);
            intList1.addAll(null);
        }
        catch (Exception ex) {
            System.out.println("Don't do this.");
        }

    }
}

