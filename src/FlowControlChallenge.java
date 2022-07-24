import java.util.Scanner;

public class FlowControlChallenge 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Hello World");
		
		AsciiChars.printNumbers();
		System.out.println();
		
		AsciiChars.printUpperCaseLetters();
		System.out.println();
		
		AsciiChars.printLowerCaseLetters();
		System.out.println();
		
		System.out.print("Please enter your name: ");     
		String name = input.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("Do you wish to continue to the interactive portion? (yes, no) or (y, n)");
		String choice = input.nextLine();
		
		if(choice.equals("yes") || choice.equals("y"))
		{
			int i = 0;
			while(i != 1)
			{    
				System.out.println("What is the name of your favorite pet Ex.(shadow, snow)");
				String petName = input.next();
				
				System.out.println("What is the age of your favorite pet. Ex.(7, 3)");
				int petAge = input.nextInt();
				
				System.out.println("What is your lucky number? Ex.(13, 100)");
				int luckyNum = input.nextInt();
				
				System.out.println("Do you have a favorite quarterback? If so what is their jersey number? Ex.(23, 7)");
				int jerseyNum = input.nextInt();
				
				System.out.println("What is two-digit model year of your car? Ex.(20, 21)");
				int carModelYear = input.nextInt();
				
				System.out.println("What is the first name of the your favorite actor or actress? Ex.(Tom, Steven)");
				String actorName = input.next();
				
				System.out.println("Enter a random number between 1 and 50");
				int randNum = input.nextInt();
				
				final int maxRandomNum = 60;
				final int minRandomNum = 1;
				final int maxMagicNum = 75;
				final int maxNonMagicNum = 65;
				int magicBallNum = 1;
		        int range = maxRandomNum - minRandomNum + 1;
		        int randNum1, randNum2, randNum3;
		        int nonMagic1, nonMagic2, nonMagic3, nonMagic4, nonMagic5;
		        
		        randNum1 = (int)(Math.random() * range) + minRandomNum;
		        randNum2 = (int)(Math.random() * range) + minRandomNum;
		        randNum3 = (int)(Math.random() * range) + minRandomNum;
		        
		        nonMagic1 = carModelYear + petAge;
		        nonMagic2 = jerseyNum + petAge + luckyNum;
		        nonMagic3 = 42;
		        nonMagic4 = luckyNum + carModelYear;
		        nonMagic5 = randNum - randNum3;
		        
		        if(nonMagic2 > maxNonMagicNum)
		        	nonMagic2 = nonMagic2 - maxNonMagicNum;
		        
		        if(nonMagic4 > maxNonMagicNum)
		        	nonMagic4 = nonMagic4 - maxNonMagicNum;
		        
		        if(nonMagic5 > maxNonMagicNum)
		        	nonMagic5 = nonMagic5 - maxNonMagicNum;
		        else if(nonMagic5 < 0)
		        	nonMagic5 = nonMagic5 + maxNonMagicNum;
		        
		        magicBallNum = magicBallNum * luckyNum;
		        
		        if(magicBallNum > maxMagicNum)
		        {
		        	magicBallNum = magicBallNum - maxMagicNum;
		        }
		        
		        System.out.printf("Lottery numbers: %d, %d %d, %d, %d  Magic ball: %d", nonMagic1,nonMagic2,nonMagic3,nonMagic4,nonMagic5, magicBallNum);
		        System.out.println();
		        
		        System.out.println("Would you like to answer questions to generate another set of numbers? (yes, no) or (y, n)");
		        String ans = input.next();
		        
		        if(ans.equals("yes") || ans.equals("y"))
		        	i = 0;
		        else if(ans.equals("no") || ans.equals("n"))
		        			i++;
		        		
		    }		
		}
		else if (choice.equals("no") || choice.equals("n"))
		{
			System.out.println("Please return later to complete the survey");
		}
		else
		{
			System.out.println("That is not a valid response please start the program over!");
		}
	}
	
}
