import java.util.*;

public class Main 
{

    public static void main(String [] args)
    {
        int mynum=(int)(Math.random()*100);

        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println(mynum);

        do{
            System.out.println("Enter your Guessed Number");
             n=sc.nextInt();
            if(n==mynum){
            System.out.println("Superb , you have guessed the number .");
            break;
            }
            else if(n>mynum){
            System.out.println("The Guessed number is too large. ");
            break;
            }
            else{
            System.out.println("The Guessed number is too small. ");
            break;
            }

        }
        while(n>=0);
    }
}