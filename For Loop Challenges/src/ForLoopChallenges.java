import java.util.Scanner;


public class ForLoopChallenges
	{

		public static void main(String[] args)
			{
				extraChallenge();
				seperateChallenges();
				donuts();
				seperateChallenges();
				oneToFive();
				seperateChallenges();
				fiveToHundred();
				seperateChallenges();
				total();
				seperateChallenges();
				printUserNumbers();
				seperateChallenges();
				rectangle();							
			}
		
		public static void seperateChallenges()
			{
				Scanner userFakeInput = new Scanner(System.in);
				String pause;
				pause = userFakeInput.nextLine();
			}
		
		public static void donuts()
			{
				for(int i = 1; i <=5; i++)
					{
						System.out.println("I love Donuts!");
					}
			}		
		
		public static void oneToFive()
			{
				for(int i = 1; i <=5; i++)
					{
						System.out.println(i);
					}
				
				for(int i = 5; i >=1; i--)
					{
						System.out.println(i);
					}
			}		
		
		public static void fiveToHundred()
			{
				for(int i = 5; i <=100; i+=5)
					{
						System.out.println(i);
					}
			}
		
		public static void total()
			{
				int total = 0;
				for(int i = 5; i <=100; i+=5)
					{
						total += i;
					}
				System.out.println("The total is " + total);
			}
		
		public static void printUserNumbers()
			{
				Scanner userInput = new Scanner(System.in);
				int total = 0;
				
				System.out.println("What is your lowerbound number?");
				int lowerNum = userInput.nextInt();
				
				System.out.println("What is your upperbound number?");
				int upperNum = userInput.nextInt();
				

				for(int i = lowerNum; i <=upperNum; i++)
					{
						total += i;
					}
				System.out.println("The total is " + total);
			}
		
		public static void rectangle()
			{
				System.out.println("*********");
				for(int i = 1; i <=9; i++)
					{
						System.out.println("*       *");
					}
				System.out.println("*********");
			}
		
		public static void extraChallenge()
			{
				System.out.println("\"dog\"");
				System.out.println("\\\\");
			}

	}
