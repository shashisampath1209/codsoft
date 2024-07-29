import java.util.*;
import java.lang.Math;
class Main{
	public static void main(String[] args) {
		int ran=(int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		boolean gf=false;
		int n= 0;
		System.out.println("Guess a number between 1 and 100: ");
		System.out.println("NOTE: You have only 5 guesses to win..!");
		while (!gf && n< 5){
		    int Gue=sc.nextInt();
		    if (Gue== ran){
		        gf = true;
		    } 
		    else{
		        n++;
		        if(Gue> ran){
		            System.out.println("Your guess is too high.");
		        }
				else{
		            System.out.println("Your guess is too low.");
		        }
		    }
		}

		if (gf){
		    System.out.println("Congratulations!...Your guess is correct! The number was " + ran);
		}
		else{
		    System.out.println("Sorry, you ran out of guesses. The System generated number was " + ran);
		}
	}
}