/**
 *  Java program to find frequency of requested character.
 */

package com.myfrequency;

import java.util.HashMap;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a string to inspect.
        String st = "abcdefgabcdefabcde";

        // Calling method to find the most frequent character.
        System.out.println(findFrequency(st, 'a'));
    }

    // Method to find frequency of a requested character.
    public static int findFrequency(String st, char ch) {

        // Frequency to return.
        int frequency = 0;

        // Creating a HashMap to store characters and frequencies.
        HashMap<Character, Integer> myMap = new HashMap<>();

        // Adding characters to myMap.
        for(int index = 0; index < st.length(); index++) {

            // Character to add to myMap.
            char c = st.charAt(index);

            // Checking if character is already in a map.
            if(myMap.containsKey(c)) {

                // Incrementing value of frequency.
                int number = myMap.get(ch) + 1;
                myMap.put(c, number);

            } else {
                // Adding character to myMap.
                myMap.put(c, 1);
            }
        }


        System.out.println(myMap);

        // Assigning frequency.
        if(myMap.containsKey(ch)) {
            frequency = myMap.get(ch);
        }


        // Return statement.
        return frequency;
    }
}