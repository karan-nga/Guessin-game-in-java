import java.util.Scanner;

public class Gussing{
   
    public static void main(String [] args){
       
        int guess= -99;
        int count =0;



        final Scanner input = new Scanner(System.in);
        System.out.println("enter th from 1 to 100");
        guess = input.nextInt();
        int randnum = (int)  (Math.random()*100 + 1);

        while(guess!= randnum){
            System.out.println("enter th from 1 to 100");
        guess = input.nextInt();
        if(guess<randnum)
        {
            System.out.println("greater");
        }
        else if(guess>randnum){
            System.out.println("lower");
        }
        else{
            System.out.println("yes you gussed it!!");
            break;
        }
    
        count++;
    }
 
    //end of whlie loop
    input.close();
    System.out.println("you take"+" "+ count+" "+" chance to guess the number right");
}
}


    


