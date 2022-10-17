package javaChallenge1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Java Challenge (1/20)

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/

public class FindLengthOfTheLastWord {
	
	public void findTheLength(String s)
	{
		
		String [] splitArray = s.split(" ");
		System.out.println(Arrays.toString(splitArray));
		List<String> listString = Arrays.asList(splitArray);
		String string = listString.get(listString.size()-1);
		int length = string.length();
		System.out.println("The Length of the last word " +string+" is----> "+length );
		
		
	}
	
	public static void main(String[] args) {
		
		FindLengthOfTheLastWord word = new FindLengthOfTheLastWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to find the length of the last word===> ");
		String s = sc.nextLine();
		word.findTheLength(s);
		word.findTheLength("Hello World");
		word.findTheLength("fly me to the moon");
		word.findTheLength("luffy is still joyboy");
		sc.close();
		
	}
	

}
