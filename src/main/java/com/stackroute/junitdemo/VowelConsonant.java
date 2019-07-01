/*
Create a program that accepts a word as input and checks for each single character letter in
the word whether it is a consonant or vowel.
Condition:
a. Print an error message if the input is not a letter
b. If the input having more than one letter, print the required output
(Vowel or Consonant) for each letter
Input : p
Output : Consonant
Input : ap
Output : Vowel Consonant (should it be a - vowel, p - consonant)
 */
package com.stackroute.junitdemo;

public class VowelConsonant {
    public static String character(String word)
    {
        String finalstring="";
        char[] ch = word.toCharArray(); // converts string into character array
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
            // checking the character is vowel or not
            {
              finalstring=finalstring+"Vowel";
            }
            else if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) // checking the character for consonant
            {
                finalstring=finalstring+"Consonant";
            }
            else
                finalstring=finalstring+"Not a Alphabet";
        }
        return finalstring;
    }
}
