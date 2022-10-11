import java.util.*;
import java.io.*;

public class Main
{
    
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("enter size of an array ");
    	int size=sc.nextInt();
    	System.out.print("enter elements of an array ");
    	int arr[]=new int[size];
    	for(int i=0;i<size;i++){
    	    arr[i]=sc.nextInt();
    	}
    	int result=0;
    	HashMap<Integer,Integer> map=new HashMap<>();
    	for(int j=0;j<size;j++){
    	    map.put(arr[j],map.getOrDefault(arr[j],0)+1);
    	}
    	for(Map.Entry entry:map.entrySet()){
    	    int value=(int)entry.getValue();
    	    if(value>=size/2){
    	        result=(int)entry.getKey();
    	        break;
    	    }
    	}
    	if(result!=0)System.out.println("majority element is present "+result);
    	else System.out.println("No majority element is present");
	
	}
	
}
