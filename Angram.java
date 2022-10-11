import java.util.*;
import java.io.*;

public class Main
{
    static boolean areAnagram(String s1,String s2){
        char[] countArray=new char[256];
        //if size of two strings vary return false
        if(s1.length()!=s2.length())return false;
        //Arrays.fill(countArray,0);
        for(int i=0;i<s1.length();i++){
            countArray[s1.charAt(i)]++;
            countArray[s2.charAt(i)]--;
        }
        //check if any position contains non zero or not
        for(int i=0;i<countArray.length;i++){
            if(countArray[i]!=0)return false;
        }
        return true;
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str1=sc.next();
	String str2=sc.next();
    boolean result=areAnagram(str1,str2);
    if(result)System.out.println("String 1 and string2 are anagram of each other");
    else System.out.println("String 1 is not anagram of string 2");
	}
}
