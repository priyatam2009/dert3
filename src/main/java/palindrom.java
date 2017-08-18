import java.util.Scanner;

public class palindrom
{

public static void main(String[] args)
{
    System.out.println("Welcome to String Util.");       
    Scanner word = new Scanner(System.in);

    String X = word.nextLine();       
    boolean R = palindrome(X);

    System.out.println();
    System.out.println("Original Word: " + X);     
    System.out.println("Palindrome: " + R);



}


public static boolean palindrome(String word)
{
	int t = word.length() - 1; //length of the word as a number
   int r = 0;


   if(word.charAt(t) == word.charAt(r))
   {
       return true;
    }
    else
    return false;
}}
