package com.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyString 
{
	Scanner sc;
	
	public MyString() {
		sc= new Scanner(System.in);
	}
	
	public String enterText()
	{
		System.out.println("Write a line: ");
		String text= sc.nextLine();
		
		return text;
	}
	
	public void countEachWordOccrence()
	{
		String word= "My Name is Java and i am a programming Language, i was developed by james gosling in 1995. ";
		
		String regExp= "\\s+|[,\\.\\^\s]+";
		String splt[]= word.split(regExp);
		
		int count;
		int visit=-1;
		int freq[] = new int[splt.length];
		
		for(int i=0;i<splt.length;i++)
		{
			count=1;
			for(int j=i+1;j<splt.length;j++)
			{
				if(splt[i].equals(splt[j]))
				{
					count++;
					freq[j]= visit;
				}
			}
			if(freq[i]!=visit)
			{
				freq[i]=count;
			}
		}
		
		System.out.println("_________");
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visit)
			{
				System.out.println(splt[i]+"  "+freq[i]);
			}
		}
	}
	
	public void fileWriteing()
	{
		FileWriter file1= null;
		try {
			file1= new FileWriter("F:\\myfile.txt");
			file1.write("The literary device, in which a phrase or word is repeated at the beginning of consecutive lines or clauses is known as anaphora. Apart from adding emphasis to the selected words, it contributes to the rhythm of a poem.");
		
			file1.close();
		}catch(IOException e)
		{
			System.out.println("Exxception thrown: "+e.getMessage());
		}
		System.out.println("file created and write");
	}
	
	public void countWordsFromFile()
	{
			HashMap<String, Integer> hm= null;	
			FileReader reader= null;
			
		try {	
			reader= new FileReader("F:\\myfile.txt");
			BufferedReader br= new BufferedReader(reader);
			
			String line=null;
			StringBuilder sb= new StringBuilder();
			
			while((line=br.readLine())!=null)
			{
				sb.append(line).append(" ");
			}
			String regExp= "\\s+|[,\\.\\^\s]+";
			String[] splt = sb.toString().split(regExp);
				
			hm= new HashMap<>();
			
			for(int i=0;i<splt.length;i++)
			{			
				if(hm.containsKey(splt[i]))
				{
					int count= hm.get(splt[i]); 
					hm.put(splt[i], count+1);
				}
				else {
					hm.put(splt[i], 1);
				}
			}
			
			System.out.println("count the freq. of the word int the file: ");
			
			hm.forEach((word, num)-> System.out.println(word+" "+num));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	public void findLengthOfString(String text)
	{
		System.out.println("length of String: "+text.length());
	}
	
	public void copyStringToanother(String text)
	{
//		String copy= String.valueOf(text);
		String copy= String.copyValueOf(text.toCharArray());
		
		System.out.println("copy String to one another: "+copy);
	}
	
	public void concatString(String text)
	{
		System.out.println("Write text to join: ");
		String join= sc.nextLine();
		
		String word=  text.concat(" "+join);
		System.out.println("concatination of two string are: "+word);
	}
	
	public void compareString(String text)
	{
		System.out.println("Write text: ");
		String compare= sc.nextLine();
		
		String status= text.equals(compare)?"both string are equal": "both string are not equal";
		System.out.println(status);
	}
	
	public void convertLowerUpperCase(String text)
	{
		System.out.println("Lower_Case : "+text.toLowerCase());
		System.out.println("Upper_Case: "+text.toUpperCase());
	}

	public void toggleCase(String text)
	{
		char word[]= text.toCharArray();
		String toggle="";
		for(int i=0;i<word.length;i++)
		{
			if(Character.isUpperCase(word[i]))
			{
				toggle+=Character.toLowerCase(word[i]);
			}else {
				toggle+=Character.toUpperCase(word[i]);
			}
		}
		System.out.println("Toggle_Case of each character : "+toggle);
	}
	
	public void findAlphabetNumberSpl(String text)
	{
		int alphabet = 0, number = 0, spl= 0;
		
		char ch[]= text.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')
			{
				alphabet++;
			}else if(ch[i]>='0' && ch[i]<='9')
			{
				number++;
			}else {
				spl++;
			}
		}
		System.out.println("Number: "+number+"\tAlphabet: "+alphabet+"\tSpecial_Char: "+spl);
	}
	
	public void findVowelConsonant(String text)
	{
		int vowel=0, consonant=0;
		
		char ch[]= text.toCharArray();
		
		String value= "aeiouAEIOU";
		for(int i=0;i<ch.length;i++)
		{
			if(value.contains(String.valueOf(ch[i])))
			{
				vowel++;
			}else if(Character.isLetter(ch[i])) 
			{
				consonant++;
			}
		}
		System.out.println(vowel+"  "+consonant);
	}
	
	public void countWordsInString(String text)
	{
		int count=0;
		char[] ch= text.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')
				count++;
		}
		System.out.println("Total number of words in a String:  "+count);
	}
	
	public void findReverse(String text)
	{
		String rev="";
		for(int i=text.length()-1;i>=0;i--)
		{
			rev+=text.charAt(i);
		}
		System.out.println("Reverse of String: "+rev);
	}
	
	public void checkPalindromeString(String text)
	{
		String palindrome="";
		
		for(int i=text.length()-1;i>=0;i--)
		{
			palindrome+=text.charAt(i);
		}
		String status= text.equals(palindrome) ? "Palindrome String" : "Not a Palindrome String";
		System.out.println(status);
	}
	 	
	public void reverseOrderOfWords(String text)
	{
		String splt[]= text.split(" ");
		String rev="";
		for(int i=splt.length-1;i>=0;i--)
		{
			System.out.print(splt[i]+" ");
			
			String word= splt[i];
			
			String temp="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				temp+=word.charAt(j);
			}
			rev+=temp+" ";
		}
		System.out.println("\n"+rev);
	}
	
	public void reverseOrderOfWords1(String text)
	{
		String splt[]= text.split(" ");
		String rev="";
		
		for(int i=0;i<splt.length;i++)
		{
			String word= splt[i];
			
			String value= "";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				value+=word.charAt(j);
			}
			rev+=value+" ";
		}	
		System.out.println("Original String : "+text);
		System.out.println("Reverse Order of Words_String : "+rev);
	}
	
	
	public void findFirstOccurrence(String text)
	{
		System.out.println("Enter character : ");
		char ch= sc.next().charAt(0);
		
		System.out.println("First Occurrence of char: "+text.indexOf(ch));
		
		findLastOccurrence(text);
	}

	public void findLastOccurrence(String text)
	{
		System.out.println("Enter character : ");
		char ch= sc.next().charAt(0);
		
		System.out.println("Last Occurrence of char: "+text.lastIndexOf(ch));	
	}

	public void searchAllOccurrenceOfString(String text)
	{
		int countFreq;
		int visit=-1;

		char ch[] = text.toCharArray();
		int freq[]= new int[ch.length];
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				freq[i]= visit;
				continue;
			}
			
			countFreq=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					countFreq++;
					freq[j]= visit;
				}
			}
			if(freq[i]!=visit)
			{
				freq[i]=countFreq;
			}
		}
		
		System.out.println("Frequency of Each character in a given String: ");
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visit)
			{
				System.out.println(ch[i]+" -  "+freq[i]);
			}
		}
	}
	
	public void countOccurenceOfCharacter(String text)
	{
		System.out.println("Enter a char to count the Occurence in a String: ");
		char ch= sc.next().charAt(0);
		
		int count=0;
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)==ch)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(ch+" Occurrence of the character in the String : "+count);
		}else 
		{
			System.out.println("can't find the char in the given String");
		}
	}
	
	public void countOccurrenceOfWOrd(String text)
	{
		System.out.println("Enter a word to count the Occurence in a String: ");
		String word= sc.nextLine();
		
		String splt[] = text.split(" ");
		int count=0;
		for(int i=0;i<splt.length;i++)
		{
			if(splt[i].contains(word))
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(word+" Occurrence of the word in the String : "+count);
		}else 
		{
			System.out.println("can't find the word in the given String");
		}
		
	}
	
	
	public void removeFirstOccurrenceOfWord(String text)
	{
		System.out.println("Enter word to remove from String: ");
		String word= sc.nextLine();
		
		String status= text.replaceFirst(word, "");
		System.out.println("After removing the first word: "+status);
	}
	
	public void removeLastOccurrenceOfWord(String text)
	{
		System.out.println("Enter word to remove from String: ");
		String word= sc.nextLine();
		
		int index= text.lastIndexOf(word);
		
		if(index!=-1)
		{
			String status= text.substring(0, index)+ text.substring(index+ word.length());
			System.out.println("After remove the Last_Occurrence : "+status);
		}else {
			System.out.println("word not found!");
		}
	}
	
	public void removeAllOccurrenceWord(String text)
	{
		System.out.println("Enter word to remove from Strring: ");
		String word= sc.nextLine();
		
		String str[]= text.split(" "); 
		String status="";
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(word))
			{
				status= text.replaceAll(word, "");
			}
		}
		System.out.println(status);
	}
	
	public void highestFrequencyCharacter(String text)
	{
		char[] ch= text.toCharArray();
		
		int freq[]= new int[256];
		
		for(int i=0;i<ch.length;i++)
		{
			freq[ch[i]]++;
		}

		int max = 0;
		int highestFreqChar= 0;
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>max)
			{
				max= freq[i];
				highestFreqChar = i;
			}
		}
		char charValue= (char) highestFreqChar;
		System.out.println("Highest Frequency Char in a String: "+charValue+"\t    Frequency: "+max);	
	}
	
	public void removeFirstOccurrenceCharacter(String text)
	{
		System.out.println("Enter a char to remove element: ");
		char ch= sc.next().charAt(0);
		
		int remove= text.indexOf(ch);
		if(remove!=-1)
		{
			String value= text.substring(0, remove)+text.substring(remove+1);
			System.out.println(value);
		}else {
			System.out.println("Char not found in the String!");
		}
	}
	
	public void removeLastOccurrenceCharacter(String text)
	{
		System.out.println("Enter a char to remove element: ");
		char ch= sc.next().charAt(0);
		
		int remove= text.lastIndexOf(ch);
		if(remove!=-1)
		{
			String value= text.substring(0, remove)+text.substring(remove+1);
			System.out.println(value);
		}else {
			System.out.println("Char not found in the String!");
		}
	}
	
	public void removeAllOccuranceChar(String text)
	{
		System.out.println("Enter a char to remove element: ");
		char ch= sc.next().charAt(0);
		
		String res="";		
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)==ch)
			{
				res= text.replace(Character.toString(ch), "");
			}
		}
		System.out.println(ch+" remove all over the String "+res);	
	}
	
	public void replaceFirstOccCharWithAnother(String text)
	{
		System.out.println("Enter char to replace : ");
		char charToReplace = sc.next().charAt(0);
		System.out.println("Enter char to replace with existing char : ");
        char replacementChar = sc.next().charAt(0);
        
        int indexReplace= text.indexOf(charToReplace);
        
        if(indexReplace!=-1)
        {
        	String status= text.substring(0, indexReplace)+ replacementChar + text.substring(indexReplace+1);
            System.out.println("String after replacing first occurrence of '" + charToReplace + "' with '" + replacementChar + "': " + status);
        }else {
        	System.out.println("element not found in the string! cannot replace.");
        }
	}
	
	public void replaceLastOccCharWithAnother(String text)
	{
		System.out.println("Enter char to replace : ");
		char charToReplace = sc.next().charAt(0);
		System.out.println("Enter char to replace with existing char : ");
        char replacementChar = sc.next().charAt(0);
        
        int indexReplace= text.lastIndexOf(charToReplace);
        
        if(indexReplace!=-1)
        {
        	String status= text.substring(0, indexReplace)+ replacementChar + text.substring(indexReplace+1);
            System.out.println("String after replacing first occurrence of '" + charToReplace + "' with '" + replacementChar + "': " + status);
        }else {
        	System.out.println("element not found in the string! cannot replace.");
        }
	}
	
	public void trimLeadingSpaces(String text)
	{
		System.out.println("Length of String:  "+text.length());
		String trimLead= text.trim();
		System.out.println("After treamming : "+trimLead);
		System.out.println("After treamming length: "+trimLead.length());
		
		String removeAllWhiteSpaces= trimLead.replaceAll("\\s+","");
		System.out.println("After remove all white spaces from string: "+removeAllWhiteSpaces);
		
	}
	
	
	

	private void display() {
		String text = enterText();
		
//		countEachWordOccrence();
//		fileWriteing();
//		countWordsFromFile();
		
//		findLengthOfString(text);
//		copyStringToanother(text);
//		concatString(text);
//		compareString(text);
//		convertLowerUpperCase(text);
//		toggleCase(text);
//		findAlphabetNumberSpl(text);
//		findVowelConsonant(text);
//		countWordsInString(text);
//		findReverse(text);
//		checkPalindromeString(text);
		
//		reverseOrderOfWords(text);
//		reverseOrderOfWords1(text);
		
//		findFirstOccurrence(text);
		
//		searchAllOccurrenceOfString(text);
//		countOccurenceOfCharacter(text);
//		countOccurrenceOfWOrd(text);
		
//		removeFirstOccurrenceOfWord(text);
//		removeLastOccurrenceOfWord(text);
//		removeAllOccurrenceWord(text);
		
//		highestFrequencyCharacter(text);
	
//		removeFirstOccurrenceCharacter(text);
//		removeLastOccurrenceCharacter(text);
//		removeAllOccuranceChar(text);
		
//		replaceFirstOccCharWithAnother(text);
//		replaceLastOccCharWithAnother(text);
		
		trimLeadingSpaces(text);
	
	}
	public static void main(String[] args) {
		
		new MyString().display();
		
	}
}
