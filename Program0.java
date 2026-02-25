import java.util.Scanner;
import java.util.random.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Program0 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		
		ArrayList<Integer> listMe = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14));
		ArrayList<Integer> listYou = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14));
		String go = "";
		int numMe;
		int numYou;
		int numMe1;
		int numYou1;
		int numMeX;
		int numYouX;
		int numMeY;
		int numYouY;
		int numMeZ;
		int numYouZ;
		int numMeX1;
		int numYouX1;
		int numMeY1;
		int numYouY1;
		int numMeZ1;
		int numYouZ1;
		int endGame=0;
		
		System.out.println("write go to to play a random card");
		System.out.println("write cards to see how many cards you have");
		for (int i=endGame; i<100000; i++)
		{

			go = input.next();
			if (go.equals("go"))
			{
				if (listMe.size()==0 || listYou.size()==0)
				{
					endGame=100000;
				}
				numMe1 = rnd.nextInt(listMe.size());
				numMe = listMe.get(numMe1);
				System.out.println("your number: " + numMe);
				numYou1 = rnd.nextInt(listYou.size());
				numYou = listYou.get(rnd.nextInt(listYou.size()));
				System.out.println("computer number: " + numYou);
				if (numMe > numYou)
				{
					listMe.add(numYou);
					listYou.remove(Integer.valueOf(numYou));
					System.out.println("you win");
				}
				if (numMe < numYou)
				{
					listYou.add(numMe);
					listMe.remove(Integer.valueOf(numMe));
					System.out.println("you lose");
				}
				if (numMe == numYou)
				{
					System.out.println(1);
					System.out.println(2);
					System.out.println(3);
					numMe1 = rnd.nextInt(listMe.size());
					numMe = listMe.get(numMe1);
					System.out.println("your number: " + numMe);
					numYou1 = rnd.nextInt(listYou.size());
					numYou = listYou.get(rnd.nextInt(listYou.size()));
					System.out.println("computer number: " + numYou);
					if (numMe < numYou)
					{
						System.out.println("you lose");
						numYouX1 = rnd.nextInt(listYou.size());
						numYouX = listYou.get(numYouX1);
						System.out.println("computer number: " + numYouX);
						numYouY1 = rnd.nextInt(listYou.size());
						numYouY = listYou.get(numYouY1);
						System.out.println("computer number: " + numYouY);
						numYouZ1 = rnd.nextInt(listYou.size());
						numYouZ = listMe.get(numYouZ1);
						System.out.println("computer number: " + numYouZ);
						numMeX1 = rnd.nextInt(listMe.size());
						numMeX = listMe.get(numMeX1);
						System.out.println("your number: " + numMeX);
						numMeY1 = rnd.nextInt(listMe.size());
						numMeY = listMe.get(numMeY1);
						System.out.println("your number: " + numMeY);
						numMeZ1 = rnd.nextInt(listMe.size());
						numMeZ = listMe.get(numMeZ1);
						System.out.println("your number: " + numMeZ);
						listYou.add(numMe);
						listMe.remove(Integer.valueOf(numMe));
						listYou.add(numMeX);
						listMe.remove(Integer.valueOf(numMeX));
						listYou.add(numMeY);
						listMe.remove(Integer.valueOf(numMeY));
						listYou.add(numMeZ);
						listMe.remove(Integer.valueOf(numMeZ));
					}
					if (numMe > numYou)
					{
						System.out.println("you win");
						numMeX1 = rnd.nextInt(listMe.size());
						numMeX = listMe.get(numMeX1);
						System.out.println("your number: " + numMeX);
						numMeY1 = rnd.nextInt(listMe.size());
						numMeY = listMe.get(numMeY1);
						System.out.println("your number: " + numMeY);
						numMeZ1 = rnd.nextInt(listMe.size());
						numMeZ = listMe.get(numMeZ1);
						System.out.println("your number: " + numMeZ);
						numYouX1 = rnd.nextInt(listYou.size());
						numYouX = listYou.get(numYouX1);
						System.out.println("computer number: " + numYouX);
						numYouY1 = rnd.nextInt(listYou.size());
						numYouY = listYou.get(numYouY1);
						System.out.println("computer number: " + numYouY);
						numYouZ1 = rnd.nextInt(listYou.size());
						numYouZ = listMe.get(numYouZ1);
						System.out.println("computer number: " + numYouZ);
						listMe.add(numYou);
						listYou.remove(Integer.valueOf(numYou));
						listMe.add(numYouX);
						listYou.remove(Integer.valueOf(numYouX));
						listMe.add(numYouY);
						listYou.remove(Integer.valueOf(numYouY));
						listMe.add(numYouZ);
						listYou.remove(Integer.valueOf(numYouZ));
					}
				}
			}
			//פקודות
			if (go.equals("cards"))
			{
				System.out.println(listMe.size());
			}	
			if (go.equals("Ucards"))
			{
				System.out.println(listYou.size());
			}	
			if (go.equals("meList"))
			{
				System.out.println(listMe);
			}
			if (go.equals("youList"))
			{
				System.out.println(listYou);
			}
		}
	}
}