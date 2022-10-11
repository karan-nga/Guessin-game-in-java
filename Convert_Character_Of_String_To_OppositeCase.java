import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<str.length();i++){
	    char ch=str.charAt(i);
	    if(Character.isSpace(ch))sb.append(ch);
	    if(Character.isLowerCase(ch))sb.append(Character.toUpperCase(ch));
	    else sb.append(Character.toLowerCase(ch));
	}
	System.out.println(sb);
	}
}
