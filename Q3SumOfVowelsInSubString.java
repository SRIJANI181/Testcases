package com.srijani;

import java.util.Scanner;

public class Q3SumOfVowelsInSubString {



public static void main(String[] args) {
// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
//System.out.println("Enter your string......");
String word = sc.next();

int count=0;
for(int i=0;i<word.length();i++)
{
String currentWord = word.substring(i, i+1);
if(isVowel(currentWord))
{

int preLetter = i+1;
int postLetter =1+(word.length() - i-1);
count = count + (preLetter * postLetter);


}
}

//System.out.println("Total number of vowels in the all substring of the given string is : " + count);
System.out.println(count);
}

private static boolean isVowel(String currentWord) {
if(currentWord.equals("a") || currentWord.equals("e") ||currentWord.equals("i") ||currentWord.equals("o") ||currentWord.equals("u"))
return true;
return false;
}

}